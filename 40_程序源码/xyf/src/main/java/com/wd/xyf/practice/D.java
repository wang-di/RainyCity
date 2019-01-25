package com.wd.xyf.practice;

interface A {
	default void say(int a) {
		System.out.println("A");
	}
}

interface B {
	default void say(short a) {
		System.out.println("B");
	}
}

interface C extends A,B{

}

public class D implements C {
	public static void main(String[] args) {
		D d = new D();
		byte a = 1;
		d.say(a); //B

		D d1 = new D();
		d1.say(1);
	}
}

