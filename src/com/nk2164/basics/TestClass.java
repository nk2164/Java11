package com.nk2164.basics;

public class TestClass {

	public static void main(String[] args) {
		Object data;
		if ((data = getData()) == null) {
			System.out.println("Hello There!!");
		}
	}
	
	public static Object getData() {
		System.out.println("I got called");
		return null;
	}
}