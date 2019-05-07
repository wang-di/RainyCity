package com.wd.xyf.practice.designPattern_factory.entity;

/**
 * @ClassName Output2LCar
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 11:07
 * @Version 1.0
 **/
public class Output2LCar implements OutputSizeCar {
	@Override
	public void outputGasSize() {
		System.out.println("排量2.0");
	}
}
