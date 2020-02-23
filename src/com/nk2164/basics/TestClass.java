package com.nk2164.basics;

class TestClass {
	static final int value; // not initializing here
	int i = 5;

	static{value=2;}
 
	{
		try {
			if (i == 0) {
				throw new Exception();
			}
			
		} catch (Exception e) {
			System.out.println("Error in Init");
		}
	}

	TestClass() {
	}

	TestClass(int x) {
	}

	TestClass(int a, int b) {
	}

	public static void main(String[] args) {

	}
}