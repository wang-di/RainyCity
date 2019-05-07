package com.wd.xyf.practice.designPattern_proxy.client;

import com.wd.xyf.practice.designPattern_proxy.user.FishMarketSellFish;
import com.wd.xyf.practice.designPattern_proxy.user.FisherSellFish;

/**
 * @ClassName StaticProxyDemo
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/14 15:13
 * @Version 1.0
 **/
public class StaticProxyDemo {

	public static void main(String[] args) {
		FishMarketSellFish fishMarketSellFish = new FishMarketSellFish(new FisherSellFish());
		int price = fishMarketSellFish.sellFish();
		System.out.println(price);
	}
}
