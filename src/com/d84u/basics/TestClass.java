package com.d84u.basics;

public class TestClass {

	public static final boolean DEBUG = false;
	
	public static void main(String[] args) throws Exception {
		int x = 0;
		if (x == 0) {
			throw new Exception();
		}
		x = 20;// unreachable code here but no compilation error
	}

	public void method() {
		if (DEBUG) {
			System.out.println(" debug statement here");
		} // works
	}

}
