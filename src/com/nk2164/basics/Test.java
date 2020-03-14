package com.nk2164.basics;

interface I1 {
	default int someMethod() {
		return 1;
	}
}

interface I2 extends I1 {
	default int someMethod() {
		return 2;
	}
}

class Class1 implements I1,I2 {
}

public class Test {
	public static void main(String[] args) {
		I1 obj = new Class1();
		System.out.println(obj.someMethod());
		
		System.out.println(Integer.valueOf('3'));
		System.out.println(Integer.valueOf(3));
	}
}