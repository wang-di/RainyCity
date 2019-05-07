package com.wd.xyf.practice.designPattern_proxy.client;

import com.wd.xyf.practice.designPattern_proxy.BuyTicket;
import com.wd.xyf.practice.designPattern_proxy.procy.UseProxy;
import com.wd.xyf.practice.designPattern_proxy.user.Scalpers;
import com.wd.xyf.practice.designPattern_proxy.user.XiaoMing;

/**
 * @ClassName DynamicProxyTest
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/14 10:50
 * @Version 1.0
 **/
public class DynamicProxyTest {

	public static void main(String[] args) {
		//动态代理需要传入接口对象，也就是接口子类
		BuyTicket buyTicket = new Scalpers(new XiaoMing());
		//将接口对象传递进代理类 使用代理方法
		BuyTicket scalpers = (BuyTicket) new UseProxy(buyTicket).getProxyInstance();
		//执行方法
		scalpers.buyTicket();
	}
}
