package com.wd.xyf.practice.designPattern_strategy;

/**
 * @ClassName MultiplicationOperation
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/15 15:08
 * @Version 1.0
 **/
public class MultiplicationOperation implements Operation {
	@Override
	public int operation(int a, int b) {
		return a * b;
	}
}
