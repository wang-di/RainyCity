package com.wd.xyf.service;

import com.wd.xyf.jpa.UserJPA;
import com.wd.xyf.pojo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * @Description 用户service
 * @Author wangdi
 * @Date 2019/2/11 16:39
 * @Version 1.0
 **/
@Service
//该注解是用来开启声明的类参与缓存,如果方法内的@Cacheable注解没有添加key值，那么会自动使用cahceNames配置参数并且追加方法名
@CacheConfig(cacheNames = "user")
public class UserService {

	@Autowired
	private UserJPA userJPA;

	@Cacheable	//配置方法的缓存参数，可自定义缓存的key以及value
	public List<UserEntity> list() {
		return userJPA.findAll();
	}
}
