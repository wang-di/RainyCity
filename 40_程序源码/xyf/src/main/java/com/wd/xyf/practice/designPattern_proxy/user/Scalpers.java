package com.wd.xyf.practice.designPattern_proxy.user;

import com.wd.xyf.practice.designPattern_proxy.BuyTicket;

/**
 * @ClassName Scalpers
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 17:45
 * @Version 1.0
 **/
public class Scalpers implements BuyTicket {

	private XiaoMing xiaoMing;

	public Scalpers(XiaoMing xiaoMing) {
		this.xiaoMing = xiaoMing;
	}


	@Override
	public void buyTicket() {
		xiaoMing.buyTicket();
		System.out.println("黄牛：出示你的身份信息");
		xiaoMing.showInformation();
		System.out.println("黄牛：正在为您刷票");
	}
}
