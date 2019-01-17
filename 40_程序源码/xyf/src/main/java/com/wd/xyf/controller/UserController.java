package com.wd.xyf.controller;

import com.wd.xyf.jpa.UserJPA;
import com.wd.xyf.mapper.UserMapper;
import com.wd.xyf.pojo.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wangdi
 * @Date 2019/1/10 18:28
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

	Logger logger = LoggerFactory.getLogger(com.wd.xyf.controller.UserController.class);

	@Autowired
	UserMapper userMapper;

	@Autowired
	private UserJPA userJPA;

	public String getUsers() {
		List<UserEntity> list = userMapper.selectAll();
		logger.info("获取{}个用户，用户名是{}", list.size(), list.get(0).getcName());
		return list.get(0).getcName();
	}

	/**
	 * @Author wangdi
	 * @Description 查询用户列表
	 * @Date 2019/1/11 17:54
	 * @return java.util.List<com.wd.xyf.pojo.UserEntity>
	 **/
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<UserEntity> list() {
//		logger.info("查询到{}条数据", userJPA.findAll().size());
		return userJPA.findAll();
	}

	/**
	 * @Author wangdi
	 * @Description 删除用户
	 * @Date 2019/1/11 17:59
	 * @Param [loginId]
	 * @return void
	 **/
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@Transactional
	public void deleteUser(String loginId) {
		userJPA.deleteByCLoginid(loginId);
	}

	/**
	 * @Author wangdi
	 * @Description 根据id删除用户
	 * @Date 2019/1/14 17:43
	 * @Param [id]
	 * @return void
	 **/
	@RequestMapping(value = "/deleteById", method = RequestMethod.GET)
	public void deleteUserById(Long id) {
		userJPA.deleteById(id);
	}

	/**
	 * @Author wangdi
	 * @Description 添加用户、修改用户
	 * @Date 2019/1/11 18:07
	 * @Param [userEntity]
	 * @return com.wd.xyf.pojo.UserEntity
	 **/
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public UserEntity save(UserEntity userEntity) {
		logger.info("保存用户");
		return userJPA.save(userEntity);
	}
}
