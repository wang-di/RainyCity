package com.wd.xyf.interceptor;

import com.wd.xyf.constant.SessionConsts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName SessionInterceptor
 * @Description session拦截器
 * @Author wangdi
 * @Date 2019/1/15 20:10
 * @Version 1.0
 **/
public class SessionInterceptor implements HandlerInterceptor {

	Logger logger = LoggerFactory.getLogger(SessionInterceptor.class);


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.info("请求URI：{}",  request.getRequestURI());
		//登录不做拦截
		if (request.getRequestURI().equals("/user/login") || request.getRequestURI().equals("/user/login_view")) {
			return true;
		}
		//验证session是否存在
		Object obj = request.getSession().getAttribute(SessionConsts.SESSION_ID);
		if (obj == null) {
			response.sendRedirect("/user/login_view");
			return false;
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}
}
