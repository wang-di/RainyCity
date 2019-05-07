package com.wd.xyf.practice.designPattern_factory.entity;

/**
 * @interface BaomaCar
 * @Description 宝马车
 * @Author wangdi
 * @Date 2019/2/13 10:58
 * @Version 1.0
 **/
public class BaomaCar implements SignNameCar {
	@Override
	public void getCarSignName() {
		System.out.println("车牌：宝马");
	}
}
