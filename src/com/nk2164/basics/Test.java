package com.nk2164.basics;

interface Flyable {
	
	static int horizontalDegree() {
		return 20;
	}
	
	default void fly() {
		System.out.println("Flying at " + horizontalDegree() + " degrees");
	}

	void land();
}

public class Test implements Flyable {
	
	static int horizontalDegree() {
		return 25;
	}
	
	@Override
	public void land() {
		System.out.println("Landing at " + -Flyable.horizontalDegree() + " degress");
		System.out.println("Landing at " + -Test.horizontalDegree() + " degress");
		
	}
	
	public static void main(String[] args) {
		new Test().fly();
		new Test().land();
	}
}


