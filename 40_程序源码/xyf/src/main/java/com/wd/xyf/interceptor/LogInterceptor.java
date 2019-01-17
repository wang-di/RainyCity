package com.wd.xyf.interceptor;

import com.alibaba.fastjson.JSON;
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

//	@Autowired
//	LogJPA logJPA;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		LogEntity logEntity = getLogInfo(request);
		LogJPA logJPA = BeanUtils.getBean(LogJPA.class, request);
		logJPA.save(logEntity);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}

	private LogEntity getLogInfo(HttpServletRequest request) {
		LogEntity logEntity = new LogEntity();
		logEntity.setClient_ip(request.getRemoteHost());
		logEntity.setUri(request.getRequestURI());
		logEntity.setMethod(request.getMethod());
		logEntity.setTime(DateUtils.getCurrTime());
		logEntity.setSessionId(getSession(request));
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

	public static void main(String[] args) {
		System.out.println(new Timestamp(System.currentTimeMillis()));
		System.out.println(DateUtils.getCurrDate());
	}



}
