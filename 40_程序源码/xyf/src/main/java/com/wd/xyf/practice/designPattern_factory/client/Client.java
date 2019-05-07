package com.wd.xyf.practice.designPattern_factory.client;

import com.wd.xyf.practice.designPattern_factory.dp_factory.*;
import com.wd.xyf.practice.designPattern_factory.entity.OutputSizeCar;
import com.wd.xyf.practice.designPattern_factory.entity.SignNameCar;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 11:16
 * @Version 1.0
 **/
public class Client {
	public static void main(String[] args) {
		AbstractCarFactory signCarFactory = FactoryProduct.getFactory("sign");
		SignNameCar signNameCar = signCarFactory.getCarName("benchi");
		signNameCar.getCarSignName();

		AbstractCarFactory outputSizeFactory = FactoryProduct.getFactory("outputSize");
		OutputSizeCar outputSizeCar = outputSizeFactory.outputSize(3);
		outputSizeCar.outputGasSize();
	}
}
