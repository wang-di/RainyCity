package com.wd.xyf.practice.designPattern_factory.dp_factory;

import com.wd.xyf.practice.designPattern_factory.entity.Car;

/**
 * @ClassName SimpleCarFactory
 * @Description 简单工厂模式
 * @Author wangdi
 * @Date 2019/2/13 10:30
 * @Version 1.0
 **/
public class SimpleCarFactory {

	public Car getCar(String type) {
		Car car = null;
		if ("benchi".equals(type)) {
//			car = new Output3LCar();
		} else if ("baoma".equals(type)) {
//			car = new Baoma_3LCar();
		}
		return car;
	}

	public static void main(String[] args) {
		SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
		simpleCarFactory.getCar("benchi").getCarName();
		simpleCarFactory.getCar("baoma").getCarName();
	}
}
