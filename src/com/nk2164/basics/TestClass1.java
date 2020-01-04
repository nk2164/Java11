package com.nk2164.basics;

public class TestClass1 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		
//		int x = 0237; // in octal
//		int y = 0b11111111; //in binary
//		int z = 0b00001111; // in binary
//		char a = '\u0003';
//		char newline = '\n';
//		
//		System.out.println(x);
//		System.out.println(a);
//		System.out.println("Hello" + newline + "World");
		
//		byte b = 10; // b is 8 bits 
//		char c = 'x'; // c is 16 bits 
//		short s = 300; // c is 16 bits 
//		int i; // i is 32 bits 
//		long l; // l is 64 bits 
//		float f;// f is 32 bits 
//		double d; // d is 64 bits 
//		
//		i = b; 
//		i = s; 
//		l = i; 
//		f = i; 
//		d = f;
		
		int i = 10; 
		char c = (char) i; // explicitly casting i to char 
		long l = 100; 
		i = (int) l; // explicitly casting l to int 
		byte b = (byte) i; // explicitly casting i to byte 
		double d = 10.0; 
		float f = (float) d; // explicitly casting d to float

		 
		
//		final int i = 10;
//		byte j = i;
//		
//		someMethod(i);
	
	}
	
	public static void someMethod(byte j) {
		System.out.println(j);
	}
}
