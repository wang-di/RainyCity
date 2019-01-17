package com.wd.xyf.utils;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName BeanUtils
 * @Description bean工具类
 * @Author wangdi
 * @Date 2019/1/17 17:53
 * @Version 1.0
 **/
public class BeanUtils {

	/**
	 * @Author wangdi
	 * @Description 通过HttpServletRequest请求对象的上下文（servletContext）获取Spring管理的Bean
	 * @Date 2019/1/17 18:37
	 * @Param [clazz, request]
	 * @return T
	 **/
	public static <T> T getBean(Class<T> clazz, HttpServletRequest request) {
		BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
		return factory.getBean(clazz);
	}
}
