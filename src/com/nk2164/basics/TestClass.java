package com.nk2164.basics;

public class TestClass {

	static int count = 5, sum = 0;

	public static void main(String[] args) {

//		doStuff1();
//		dostuff2();
//		doWhile();
		myForLoop();
	}

	public static void doStuff1() {
		int i = 4;

		while (i > 0) {
			i--;
			System.out.println(" i is " + i);
		}

		System.out.println(" Value of i after the loop is " + i);
	}
	
	private static void dostuff2() {
		int i = 4; 
		
		while(i-- > 0) System.out.println(" i is "+ i); // no curly braces 
		
		System.out.println(" Value of i after the loop is "+ i); 
	}
	
	static private void doWhile() {
		int i = 4; 
		
		do System.out.println(" i is "+ i); 
		while( i--> 0); 
		
		System.out.println(" Loop finished. i is "+ i);
	}
	
	static private void myForLoop() {
		int i = 4;
		
		for (System.out.println("Starting loop now"); i > 0; System.out.println(i),i--);
		
		System.out.println("Loop finished. i is "+ i);
	}

}