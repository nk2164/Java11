package com.nk2164.basics;

public class TestClass1 {

	Object instanceVar;

	public TestClass1(Object methodParam) {
		instanceVar = methodParam;
	}

	public static void main(String[] args) {

		LABEL_1: for (int i = 0; i < 10; i++) {
			if (i == 2)
				System.out.println(2);

			for (int j = 0; j < 10; j++) {
				if (i == 2)
					continue LABEL_1; // usage of continue is valid because it refers to an outer loop.
			}
		}
	
	  doIt(5); 

	}

	static void doIt(int h) {
		
		int x = 1;

		LOOP1: do {
			LOOP2: for (int y = 1; y < h; y++) {
				if (y == x)
					continue;

				if (x * x + y * y == h * h) {
					System.out.println(" Found " + x + " " + y);
					break LOOP1;
				}
			}
			x++;
		} while (x < h);
	}

}