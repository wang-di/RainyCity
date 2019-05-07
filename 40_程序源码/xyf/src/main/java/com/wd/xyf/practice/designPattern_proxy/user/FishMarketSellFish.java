package com.wd.xyf.practice.designPattern_proxy.user;

/**
 * @ClassName FishMarketSellFish
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/14 15:11
 * @Version 1.0
 **/
public class FishMarketSellFish implements SellFish {

	private FisherSellFish fisherSellFish;

	public FishMarketSellFish(FisherSellFish fisherSellFish) {
		this.fisherSellFish = fisherSellFish;
	}

	@Override
	public int sellFish() {
		return fisherSellFish.sellFish() + 5;
	}
}
