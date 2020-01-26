package com.nk2164.basics;

import java.util.Arrays;
import java.util.Iterator;

public class TestClass5 {

	public TestClass5() {
		System.out.println("Constructor executed!");
	}

	public static void main(String[] args) {
		new TestClass5();
	}

	//Instance init block
	{
		System.out.println("Instance init executed!");
	}
	
	static {
		System.out.println("Static init executed!");
	}

}