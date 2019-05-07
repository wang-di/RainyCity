package com.wd.xyf.practice.designPattern_factory.dp_factory;

import com.wd.xyf.practice.designPattern_factory.entity.OutputSizeCar;
import com.wd.xyf.practice.designPattern_factory.entity.SignNameCar;

/**
 * @ClassName AbstractCarFactory
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 15:28
 * @Version 1.0
 **/
public abstract class AbstractCarFactory {

	public abstract SignNameCar getCarName(String signName);

	public abstract OutputSizeCar outputSize(Integer outputSize);
}
