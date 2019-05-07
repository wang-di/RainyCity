package com.wd.xyf.practice.designPattern_proxy.procy;

import com.wd.xyf.practice.designPattern_proxy.invocation.SellFishInvocation;
import com.wd.xyf.practice.designPattern_proxy.user.SellFish;

import java.lang.reflect.Proxy;

/**
 * @ClassName SellFishProxy
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/14 15:30
 * @Version 1.0
 **/
public class SellFishProxy {

	private Object object;

	public SellFishProxy(Object object) {
		this.object = object;
	}

	public Object getInstance() {
		return Proxy.newProxyInstance(object.getClass().getClassLoader(),  object.getClass().getInterfaces(), new SellFishInvocation(object));
	}
}
