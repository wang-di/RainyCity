package com.wd.xyf.practice.designPattern_proxy.user;

/**
 * @ClassName FisherSellFish
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/14 15:09
 * @Version 1.0
 **/
public class FisherSellFish implements SellFish {
	@Override
	public int sellFish() {
		return 10;
	}
}
