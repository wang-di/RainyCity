/*
package com.wd.xyf.conf;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

*/
/**
 * @ClassName FastJsonConfiguration
 * @Description fastjson配置类
 * WebMvcConfigurationSupport:SpringBoot内部提供专门处理用户自行添加配置，不仅包括修改视图的过滤，还有拦截器、过滤器、Cors配置等
 * @Author wangdi
 * @Date 2019/1/15 13:39
 * @Version 1.0
 **//*

@Configuration
public class FastJsonConfiguration extends WebMvcConfigurationSupport {

	*/
/**
	 * @Author wangdi
	 * @Description 修改自定义消息转换器
	 * @Date 2019/1/15 14:19
	 * @Param [converters：消息转换器列表]
	 **//*

	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		//调用父类的配置
		super.configureMessageConverters(converters);
		//创建fastJson消息转换器
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		//创建配置类
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		//修改配置返回内容的过滤
		fastJsonConfig.setSerializerFeatures(
				SerializerFeature.DisableCircularReferenceDetect,
				SerializerFeature.WriteMapNullValue,
				SerializerFeature.WriteNullStringAsEmpty
		);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		//将fastjson添加到视图消息转化器列表内
		converters.add(fastConverter);
	}

	*/
/**
	 * @Description FastJson SerializerFeatures
	 * WriteNullListAsEmpty  ：List字段如果为null,输出为[],而非null
	 * WriteNullStringAsEmpty ： 字符类型字段如果为null,输出为"",而非null
	 * DisableCircularReferenceDetect ：消除对同一对象循环引用的问题，默认为false（如果不配置有可能会进入死循环）
	 * WriteNullBooleanAsFalse：Boolean字段如果为null,输出为false,而非null
	 * WriteMapNullValue：是否输出值为null的字段,默认为false。
	 **//*

}
*/
