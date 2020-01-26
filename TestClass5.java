package com.nk2164.basics;

public class TestClass5 {

	{
	 printI(); // valid forward reference 
	} 

	private TestClass5() {
		// TODO Auto-generated constructor stub
	}
	
	void printI(){ 
		System.out.println(i); 
	} 
	
	int i = 10;
				
	public static void main( String[] args){ 
		
		System.out.println(new TestClass5().i);
		//new TestClass5Test(); - Wont compile
	} 

}

class TestClass5Test {
	
	private TestClass5Test() {
	}
	
}