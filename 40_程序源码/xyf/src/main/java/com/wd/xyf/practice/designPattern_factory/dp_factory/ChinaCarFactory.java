package com.wd.xyf.practice.designPattern_factory.dp_factory;

import com.wd.xyf.practice.designPattern_factory.entity.Car;

/**
 * @ClassName ChinaCarFactory
 * @Description 国产车工厂类
 * @Author wangdi
 * @Date 2019/2/13 12:27
 * @Version 1.0
 **/
public class ChinaCarFactory extends SimpleCarFactory {
	@Override
	public Car getCar(String type) {
		return super.getCar(type);
	}
}
