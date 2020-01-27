package com.nk2164.basics;

public class TestClass {

	static final boolean DEBUG = true; // initializing at the time of declaration
	static final int value; // not initializing value here
	static {
		value = 10;
	}

	static {
//		value += 10; //Reassigning a value in another static init is not permitted.
	}

	public static void main(String[] args) {
		System.out.println(value);
	}

}