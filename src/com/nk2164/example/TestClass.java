package com.nk2164.example;

class TestClass {
	public static void main(String[] args) {
		InterestCalculator ic = new InterestCalculator();
		double interest = ic.computeInterest(100, 2, 0.1);
		System.out.println(interest); // prints 20.0 
		ic = new CompoundInterestCalculator(); 
		interest = ic.computeInterest( 100, 2, 0.1);
		System.out.println( interest); // prints 21.0
		
		String x = "hello";
	}
}