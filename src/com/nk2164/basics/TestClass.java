package com.nk2164.basics;

public class TestClass {

	public static void main(String[] args) {
		int x = 0;
		if (x++ > 0) { // line 2
			x--; // line 3
		}

		if (++x == 2) { // line 6
			x++; // line 7
		}

		System.out.println(x);
	}

}