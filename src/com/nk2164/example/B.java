package com.nk2164.example;

public class B extends A {
	static {
		System.out.println(" In B's static initializer");
	}
	{
		System.out.println(" In B's instance initializer");
	}

	B() {
		System.out.println(" In B's constructor");
	}

	public static void main(String[] args) {
		System.out.println(" In B.main()");
		B b = new B();
		System.out.println();
		B b2 = new B();
	}
}