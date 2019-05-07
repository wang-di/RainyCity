package com.wd.xyf.practice.designPattern_factory.dp_factory;

import com.wd.xyf.practice.designPattern_factory.entity.Output2LCar;
import com.wd.xyf.practice.designPattern_factory.entity.Output3LCar;
import com.wd.xyf.practice.designPattern_factory.entity.OutputSizeCar;
import com.wd.xyf.practice.designPattern_factory.entity.SignNameCar;

/**
 * @ClassName OutputSizeFactory
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 15:56
 * @Version 1.0
 **/
public class OutputSizeFactory extends AbstractCarFactory {
	@Override
	public SignNameCar getCarName(String signName) {
		return null;
	}

	@Override
	public OutputSizeCar outputSize(Integer outputSize) {
		if (3 == outputSize) {
			return new Output3LCar();
		} else if (2 == outputSize) {
			return new Output2LCar();
		}
		return null;
	}
}
