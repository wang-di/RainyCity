package com.trorc.RainyCity.controller;

import com.trorc.RainyCity.mapper.UserMapper;
import com.trorc.RainyCity.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName UserController
 * Description 用户控制类
 * @Author WD
 * @Date 2018/12/23 15:28
 * Version 1.0
 */
@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/getUsres")
    @ResponseBody
    public String getUsers() {
        List<User> list = userMapper.selectAll();
        logger.info("获取{}个用户，用户名是{}", list.size(), list.get(0).getC_name());
        return list.get(0).getC_name();
    }

}
