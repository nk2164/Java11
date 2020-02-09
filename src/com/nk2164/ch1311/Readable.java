package com.nk2164.ch1311;

public interface Readable {

	int SIZE = 10;
	
	void read();
	
	static void staticMethod() {
		System.out.println("In readable static method!");
	}
	
	default void defaultMethod() {
		System.out.println("In default method!");
	}
}
