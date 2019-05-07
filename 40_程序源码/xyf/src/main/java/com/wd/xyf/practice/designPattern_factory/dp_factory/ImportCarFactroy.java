package com.wd.xyf.practice.designPattern_factory.dp_factory;

import com.wd.xyf.practice.designPattern_factory.entity.Car;

/**
 * @ClassName ImportCarFactroy
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 11:24
 * @Version 1.0
 **/
public class ImportCarFactroy extends SimpleCarFactory {
	@Override
	public Car getCar(String type) {
		Car car = null;
		if ("benchi".equals(type)) {
//			car = new Output3LCar();
		} else if ("baoma".equals(type)) {
//			car = new Baoma_3LCar();
		}
		return car;
	}
}
