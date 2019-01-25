package com.wd.xyf.controller;

import com.wd.xyf.constant.RequestConsts;
import com.wd.xyf.jpa.UserJPA;
import com.wd.xyf.pojo.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

/**
 * @ClassName LoginController
 * @Description 登录控制器
 * @Author wangdi
 * @Date 2019/1/15 15:07
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/user")
public class LoginController {

	Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserJPA userJPA;

	@RequestMapping(value = "/login")
	public String login(UserEntity user, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean pass= true;
		String result = "登录成功";
		//根据用户名查询用户
		//TODO 理解jpa findOne()
		Optional<UserEntity> opt = userJPA.findOne(new Specification<UserEntity>() {
			@Override
			public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
				criteriaQuery.where(criteriaBuilder.equal(root.get("cName"), user.getName()));
				return null;
			}
		});

		if (!opt.isPresent()) {
			pass = false;
			result = "用户不存在，登录失败";
		} else if (!opt.get().getPassword().equals(user.getPassword())) {
			pass = false;
			result = "用户密码输入错误，登录失败";
		}

		//登录成功
		if(pass) {
			//将用户写入session
		 	request.getSession().setAttribute("_session_user", opt.get());
		}

		//将返回结果写入请求对象中
		request.setAttribute(RequestConsts.LOG_RETURN, result);
		if (pass) {
			response.sendRedirect("/user/index");
		}

		return result;
	}
}
