package com.wd.xyf.practice.designPattern_factory.dp_factory;

/**
 * @ClassName FactoryProduct
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/13 15:58
 * @Version 1.0
 **/
public class FactoryProduct {

	public static AbstractCarFactory getFactory(String factoryType) {
		if ("sign".equals(factoryType)) {
			return new SignCarFactory();
		} else if ("outputSize".equals(factoryType)) {
			return new OutputSizeFactory();
		}
		return null;
	}
}
