package com.wd.xyf.practice.designPattern_proxy.user;

import com.wd.xyf.practice.designPattern_proxy.BuyTicket;

/**
 * @ClassName XiaoMing
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 17:42
 * @Version 1.0
 **/
public class XiaoMing implements BuyTicket {
	@Override
	public void buyTicket() {
		System.out.println("你好，我要买票");
	}

	public void showInformation() {
		System.out.println("小明：你好，这是我的身份信息");
	}
}
