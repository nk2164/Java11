package com.nk2164.example;

public class Calculator {

	double interest = 0.1;
	int principal = 85000;
	int numYears = 5;
	
	public double computeInterest() {
		return interest * principal * numYears;
		
	}
}
