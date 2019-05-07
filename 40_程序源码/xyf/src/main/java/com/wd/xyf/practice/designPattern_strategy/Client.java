package com.wd.xyf.practice.designPattern_strategy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/15 15:51
 * @Version 1.0
 **/
public class Client {

	public static void main(String[] args) {

		CalculateResult addResult = new CalculateResult(new AddOperation());
		System.out.println(addResult.getResult(1, 2));

		CalculateResult subtractResult = new CalculateResult(new SubtractOperation());
		System.out.println(subtractResult.getResult(4, 2));

		CalculateResult multiplicationResult = new CalculateResult(new MultiplicationOperation());
		System.out.println(multiplicationResult.getResult(3, 3));
	}
}
