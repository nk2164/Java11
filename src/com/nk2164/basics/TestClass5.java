package com.nk2164.basics;

public class TestClass5 {

	{
	 printI(); // valid forward reference 
	} 
	
	void printI(){ 
		System.out.println(i); 
	} 
	
	int i = 10;
				
	public static void main( String[] args){ 
		
		System.out.println(new TestClass5().i);
	} 

}