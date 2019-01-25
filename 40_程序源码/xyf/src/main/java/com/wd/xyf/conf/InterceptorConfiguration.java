package com.wd.xyf.conf;

import com.wd.xyf.interceptor.LogInterceptor;
import com.wd.xyf.interceptor.SessionInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
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

	//是否开发环境
	@Value("${dev}")
	private boolean isDev;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		if (!isDev) {	//开发环境屏蔽拦截器
			//添加session拦截器
			registry.addInterceptor(getSessionInterceptor()).addPathPatterns("/**");
			//添加日志记录拦截器
			registry.addInterceptor(getLogInterceptor()).addPathPatterns("/**");
		}
	}

	/**
	 * @Author wangdi
	 * @Description 将自定义拦截器注册到spring bean中
	 * 拦截器加载在springContext之前，在拦截器中注入配置参数值获取不到
	 * @Date 2019/1/23 16:03
	 **/
	@Bean
	public LogInterceptor getLogInterceptor() {
		return new LogInterceptor();
	}

	@Bean
	public SessionInterceptor getSessionInterceptor() {
		return new SessionInterceptor();
	}
}
