package com.wd.xyf.practice.designPattern_strategy;

/**
 * @ClassName AddOperation
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/15 15:05
 * @Version 1.0
 **/
public class AddOperation implements Operation {
	@Override
	public int operation(int a, int b) {
		return a + b;
	}
}
