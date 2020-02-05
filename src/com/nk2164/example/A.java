package com.nk2164.example;

class A {
	static {
		System.out.println(" In A's static initializer");
	}

	A() {
		System.out.println(" In A's constructor");
	}

	{
		System.out.println(" In A's instance initializer");
	}
}