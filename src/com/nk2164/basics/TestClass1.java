package com.nk2164.basics;

public class TestClass1 {

	Object instanceVar;

	public TestClass1(Object methodParam) {
		instanceVar = methodParam;
	}

	public static void main(String[] args) {
		Object tempVar = new Object(); // 1
		TestClass1 tc = new TestClass1(tempVar); // 2
		tempVar = new Object(); // 3
		tc.instanceVar = null; // 4
	}

}
