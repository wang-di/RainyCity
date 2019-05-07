package com.wd.xyf.practice.designPattern_factory.dp_factory;

import com.wd.xyf.practice.designPattern_factory.entity.BaomaCar;
import com.wd.xyf.practice.designPattern_factory.entity.BenchiCar;
import com.wd.xyf.practice.designPattern_factory.entity.OutputSizeCar;
import com.wd.xyf.practice.designPattern_factory.entity.SignNameCar;

/**
 * @ClassName SignCarFactory
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 15:39
 * @Version 1.0
 **/
public class SignCarFactory extends AbstractCarFactory {
	@Override
	public SignNameCar getCarName(String signName) {
		if ("benchi".equals(signName)) {
			return new BenchiCar();
		} else if ("baoma".equals(signName)) {
			return new BaomaCar();
		}
		return null;
	}

	@Override
	public OutputSizeCar outputSize(Integer outputSize) {
		return null;
	}
}
