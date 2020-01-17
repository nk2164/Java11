package com.nk2164.basics;

public class TestClass {

	public static void main(String[] args) {

		int a = 3;
		int b = 3;
		
		String str = a == b? "5" : "hello";
		System.out.println(str);
		
		String s = "12";
		
		switch (s) {
		case "1" + "2":
			System.out.println("I came here");
			break;

		default:
			break;
		}
	
	}

}