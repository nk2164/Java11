package com.nk2164.basics;

public class TestClass5 {
	int id;
	String name;

	public TestClass5() {
		id = 111;
		name = "dummy";
	}

	void reset() {
		// this(); // <-- LINE A
		// TestClass5(); // <-- LINE B
		// this = new TestClass5(); // <-- LINE C
		// new TestClass5(); // <-- LINE D
	}

	public static void main(String[] args) {
		TestClass5 a = new TestClass5();
		a.id = 2;
		a.name = "amy";
		a.reset();
		System.out.println(a.id + ", " + a.name);
	}

}