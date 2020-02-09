package com.nk2164.example;

public class TestCalculator {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.computeInterest());
		Calculator c2 = new SpecialCalculator();
		System.out.println(c2.computeInterest());
		SpecialCalculator c3 = new SpecialCalculator();
		System.out.println(c3.computeInterest());
	}

}
