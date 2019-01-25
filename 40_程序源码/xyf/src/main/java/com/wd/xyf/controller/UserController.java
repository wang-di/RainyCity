package com.wd.xyf.controller;

import com.wd.xyf.jpa.UserJPA;
import com.wd.xyf.mapper.UserMapper;
import com.wd.xyf.pojo.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description 用户控制器
 * @Author wangdi
 * @Date 2019/1/10 18:28
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

	Logger logger = LoggerFactory.getLogger(com.wd.xyf.controller.UserController.class);

	@Autowired
	private UserJPA userJPA;

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
		userJPA.deleteByLoginid(loginId);
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

	@RequestMapping(value = "/age")
	public List<UserEntity> age() {
		return userJPA.queryByAge(20);
	}

	@RequestMapping(value = "/deleteByNamePwd")
	public String deleteByNamePwd(String userName, String password) {
		int deleteNum = userJPA.nq_deleteUser(userName, password);
		return "根据用户名和密码删除用户数：" + deleteNum;
	}

	@RequestMapping(value = "/queryByPage")
	public List<UserEntity> queryByPage(int page) {
		UserEntity userEntity = new UserEntity();
		userEntity.setPage(page);
		userEntity.setSort(Sort.Direction.ASC);
		userEntity.setSidx("id");
		userEntity.setSize(2);
		Sort sort = new Sort(userEntity.getSort(), userEntity.getSidx());
		//创建分页对象
		PageRequest pageRequest = PageRequest.of(userEntity.getPage() - 1, userEntity.getSize(), sort);
		//执行分页查询
		return userJPA.findAll(pageRequest).getContent();
	}
}
