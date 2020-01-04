package com.nk2164.basics;

public class TestClass1 {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;
		float f = Float.MAX_VALUE;
		
		f = i;  // integer to float is ok
		i = (int) f; // float to integer requires explicit cast
	}

}
