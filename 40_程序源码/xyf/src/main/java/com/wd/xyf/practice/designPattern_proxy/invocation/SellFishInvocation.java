package com.wd.xyf.practice.designPattern_proxy.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName SellFishInvocation
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/14 15:18
 * @Version 1.0
 **/
public class SellFishInvocation implements InvocationHandler {

	private Object object;

	public SellFishInvocation(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		int result = (int) method.invoke(object, args) + 10;
		return result;
	}
}
