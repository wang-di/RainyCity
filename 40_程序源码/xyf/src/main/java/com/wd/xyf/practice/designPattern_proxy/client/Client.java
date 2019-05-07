package com.wd.xyf.practice.designPattern_proxy.client;

import com.wd.xyf.practice.designPattern_proxy.user.Scalpers;
import com.wd.xyf.practice.designPattern_proxy.user.XiaoMing;

import java.lang.reflect.Proxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 17:48
 * @Version 1.0
 **/
public class Client implements ClientInterface {
	public static void main(String[] args) {
		Scalpers scalpers = new Scalpers(new XiaoMing());
		scalpers.buyTicket();
	}
}