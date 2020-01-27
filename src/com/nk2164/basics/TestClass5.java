package com.nk2164.basics;

public class TestClass5 {
	int id;
	String name;
	static int var1;

	public TestClass5() {
		id = 111;
		name = "dummy";
		var1 += 20;
	}

	void reset() {
		// this(); // <-- LINE A
		// TestClass5(); // <-- LINE B
		// this = new TestClass5(); // <-- LINE C
		// new TestClass5(); // <-- LINE D
	}

	public static void main(String[] args) {
		System.out.println(TestClass5.var1);

		TestClass5 a = new TestClass5();

		System.out.println(TestClass5.var1);
		new TestClass5();
		System.out.println(a.var1);
		
		a.id = 2;
		a.name = "amy";
		a.reset();
		System.out.println(a.id + ", " + a.name);
	}

}