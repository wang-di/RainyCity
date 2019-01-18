package com.wd.xyf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author wangdi
 * @Date 2019/1/15 17:27
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
public class IndexController {

	/**
	 * @Author wangdi
	 * @Description 初始化登录页面
	 * @Date 2019/1/15 17:32
	 * @return java.lang.String
	 **/
	@RequestMapping(value = "/login_view", method = RequestMethod.GET)
	public String login_view() {
		return "login";
	}

	/**
	 * @Author wangdi
	 * @Description 初始化首页
	 * @Date 2019/1/15 17:33
	 * @return java.lang.String
	 **/
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	/**
	 * @Author wangdi
	 * @Description 下载页面
	 * @Date 2019/1/18 16:27
	 * @return java.lang.String
	 **/
	@RequestMapping(value = "/upload")
	public String upload() {
		return "upload";
	}
}
