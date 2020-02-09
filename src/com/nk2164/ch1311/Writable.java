package com.nk2164.ch1311;

public interface Writable {

	int SIZE = 20;
	
	void write();
	
	static void staticMethod() {
		System.out.println("In writeable static method!");
	}
	
	default void defaultMethod() {
		System.out.println("In default method!");
	}
	
	void defaultmethod();
}