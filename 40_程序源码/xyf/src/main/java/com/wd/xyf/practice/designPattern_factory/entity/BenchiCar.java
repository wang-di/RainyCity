package com.wd.xyf.practice.designPattern_factory.entity;

/**
 * @ClassName BenchiCar
 * @Description 奔驰车
 * @Author wangdi
 * @Date 2019/2/13 10:46
 * @Version 1.0
 **/
public class BenchiCar implements SignNameCar {
	@Override
	public void getCarSignName() {
		System.out.println("车牌：奔驰");
	}
}
