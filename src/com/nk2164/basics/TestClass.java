package com.nk2164.basics;

public class TestClass {

	public static void main(String[] args) {
		byte b1 = 1;
		byte b2 = ++b1; // result of + + b1 will be a byte
		b2 = b1--; // result of b1-- will be a byte
		b1 *= b2; // result will be a byte
		double d = 1.0;
		float f = 2.0f;
		f += d; // result of will be a float
	}
}