package com.wd.xyf.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName ResourceConfiguration
 * @Description 资源配置
 * @Author wangdi
 * @Date 2019/1/18 14:44
 * @Version 1.0
 **/
@Configuration
public class ResourceConfiguration implements WebMvcConfigurer {

	/**
	 * @Author wangdi
	 * @Description 自定义静态资源文件路径
	 * 配置静态资源的路径为“/resources/**”，只要访问地址的前缀是“/resources/”，就会被自动转到项目根目录下的static文件夹内
	 * @Date 2019/1/18 14:54
	 * @Param [registry]
	 **/
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/");
	}
}
