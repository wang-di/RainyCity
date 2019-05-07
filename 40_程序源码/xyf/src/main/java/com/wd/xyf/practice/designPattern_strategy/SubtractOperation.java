package com.wd.xyf.practice.designPattern_strategy;

/**
 * @ClassName SubtractOperation
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/15 15:06
 * @Version 1.0
 **/
public class SubtractOperation implements Operation {
	@Override
	public int operation(int a, int b) {
		return a - b;
	}
}
