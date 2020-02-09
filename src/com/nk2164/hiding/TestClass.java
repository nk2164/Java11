package com.nk2164.hiding;

class TestClass {
	public static void main(String[] args) {
		CompoundInterestCalculator cic = new CompoundInterestCalculator();
		System.out.println(cic.yrs); // prints 20
		System.out.println(((InterestCalculator) cic).yrs); // prints 10

		System.out.println(cic.rate); // prints 0.2
		System.out.println(((InterestCalculator) cic).rate); // prints 0.1

		System.out.println(cic.getClassName()); // prints CompoundInterestCalculator

		System.out.println(((InterestCalculator) cic).getClassName()); // prints InterestCalculator

	}
}