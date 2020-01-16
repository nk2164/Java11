package com.nk2164.basics;

public class TestClass {

	public static void main(String[] args) {
		int value = 3;

		if (value == 0)
			if (value == 1)
				System.out.println(" b");
			else
				System.out.println(" c");
		else
			System.out.println("did not go in");
		
		
		value = 3; 
		if( value == 0) 
			if( value == 1) 
				System.out.println(" b"); 
			else 
				System.out.println(" c"); 
		else 
			System.out.println(" d");


	}
}