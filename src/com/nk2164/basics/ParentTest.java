package com.nk2164.basics;

public class ParentTest {
	
	public static void main(String[] args) {
		Son1 a = new Son1();
		Son1.count = 20;
		System.out.println("Son1 count is now : " + Son1.count);
		
		Son2 b = new Son2();
		System.out.println(Son2.count);
	}

}
