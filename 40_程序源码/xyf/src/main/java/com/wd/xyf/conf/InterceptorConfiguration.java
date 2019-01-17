package com.wd.xyf.conf;

import com.wd.xyf.interceptor.LogInterceptor;
import com.wd.xyf.interceptor.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName SessionConfiguration
 * @Description 拦截器自定义配置
 * @Author wangdi
 * @Date 2019/1/15 20:29
 * @Version 1.0
 **/
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//添加session拦截器
		registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
		//添加日志记录拦截器
		registry.addInterceptor(new LogInterceptor()).addPathPatterns("/**");
	}
}
