package com.nk2164.basics;

public class InstanceCounter {

	static int count;

	InstanceCounter(){ // directly accessing count from a constructor 
		count ++; 
	}

	static void printCount() { // directly accessing count from a static method
		System.out.println(count);
	}

	void reduceCount() { // directly accessing count from an instance method 
		count--; 
	} 
}