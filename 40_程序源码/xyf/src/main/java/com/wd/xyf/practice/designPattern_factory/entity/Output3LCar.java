package com.wd.xyf.practice.designPattern_factory.entity;

/**
 * @ClassName Output3LCar
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 11:05
 * @Version 1.0
 **/
public class Output3LCar implements OutputSizeCar {

	@Override
	public void outputGasSize() {
		System.out.println("排量3.0");
	}
}
