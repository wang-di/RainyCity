package com.wd.xyf.practice.designPattern_proxy.client;

import com.wd.xyf.practice.designPattern_proxy.procy.SellFishProxy;
import com.wd.xyf.practice.designPattern_proxy.user.FisherSellFish;
import com.wd.xyf.practice.designPattern_proxy.user.SellFish;

import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicProxyDemo
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/14 15:28
 * @Version 1.0
 **/
public class DynamicProxyDemo {

	public static void main(String[] args) {
		SellFish fisherSellFish = new FisherSellFish();
		int price =	((SellFish)new SellFishProxy(fisherSellFish).getInstance()).sellFish();
		System.out.println(price);
	}
}
