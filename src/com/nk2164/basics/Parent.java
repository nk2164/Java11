package com.nk2164.basics;

public class Parent {
	
	static int count = 10;
	
	static {
		System.out.println("Count is initialized to " + count);
		count = count + 10;
		System.out.println("Added 10, Count is now " + count);
	}

}
