package com.wd.xyf.interceptor;

import com.alibaba.fastjson.JSON;
import com.wd.xyf.constant.RequestConsts;
import com.wd.xyf.constant.SessionConsts;
import com.wd.xyf.jpa.LogJPA;
import com.wd.xyf.pojo.LogEntity;
import com.wd.xyf.utils.BeanUtils;
import com.wd.xyf.utils.DateUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;

/**
 * @ClassName LogInterceptor
 * @Description 日志拦截器
 * @Author wangdi
 * @Date 2019/1/16 14:28
 * @Version 1.0
 **/
public class LogInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		LogEntity logEntity = getLogInfo(request);

		//设置log实体到request中，以便afterCompletion中使用
		request.setAttribute(RequestConsts.LOG_ENTITY, logEntity);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		LogJPA logJPA = BeanUtils.getBean(LogJPA.class, request);
		LogEntity logEntity = (LogEntity) request.getAttribute(RequestConsts.LOG_ENTITY);
		if (logEntity != null) {
			logEntity.setReturnCode(response.getStatus());
			Timestamp returnTime =  DateUtils.getCurrTime();
			logEntity.setReturnTime(returnTime);
			logEntity.setCostTime(returnTime.getTime() - logEntity.getRequestTime().getTime());
			//获取返回的数据，可以考虑使用AOP实现
			logEntity.setReturnData((String) request.getAttribute(RequestConsts.LOG_RETURN));
			logJPA.save(logEntity);
		}
	}

	private LogEntity getLogInfo(HttpServletRequest request) {
		LogEntity logEntity = new LogEntity();
		logEntity.setClient_ip(request.getRemoteHost());
		logEntity.setUri(request.getRequestURI());
		logEntity.setMethod(request.getMethod());
		logEntity.setRequestTime(DateUtils.getCurrTime());
//		logEntity.setSessionId(getSession(request));
		logEntity.setSessionId(request.getRequestedSessionId());
		logEntity.setParams(JSON.toJSONString(request.getParameterMap()));
		return logEntity;
	}

	private String getSession(HttpServletRequest request) {
		Object obj = request.getSession().getAttribute(SessionConsts.SESSION_ID);
		if (obj != null) {
			return String.valueOf(obj.hashCode());
		}
		return null;
	}


}
