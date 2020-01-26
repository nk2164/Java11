package com.nk2164.basics;

import java.util.Arrays;
import java.util.Iterator;

public class TestClass5 {

	public TestClass5() {
		System.out.println("Constructor executed!");
	}

	public static void main(String[] args) {
		{
			System.out.println("In main method!");
			{
			  System.out.println("One more");
			  {
				  System.out.println("Another one!");
			  }
			}

		}

		new TestClass5();
		
		{
			System.out.println("out side but inside main");
		}
		
		System.out.println();
		new TestClass5();
	}

	//Instance init block
	{
		System.out.println("Instance init executed!");
	}
	// static init block
	static {
		System.out.println("Static init executed!");
	}

}