package com.wd.xyf.practice.designPattern_strategy;

/**
 * @ClassName CalculateResult
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/15 15:49
 * @Version 1.0
 **/
public class CalculateResult {

	private Operation operation;

	public CalculateResult(Operation operation) {
		this.operation = operation;
	}

	public int getResult(int a, int b) {
		return operation.operation(a, b);
	}
}
