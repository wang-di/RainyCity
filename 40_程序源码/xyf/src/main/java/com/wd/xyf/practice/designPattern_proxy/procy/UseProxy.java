package com.wd.xyf.practice.designPattern_proxy.procy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName UseProxy
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/14 10:23
 * @Version 1.0
 **/
public class UseProxy {

	private Object object;

	public UseProxy(Object object) {
		this.object = object;
	}


	public Object getProxyInstance() {
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("----开始动态代理----");
				Object returnValue = method.invoke(object, args);
				System.out.println("----结束动态代理----");
				return returnValue;
			}
		});
	}
}
