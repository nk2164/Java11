package com.nk2164.example;

class CompoundInterestCalculator extends InterestCalculator {
	
	public double computeInterest(double principle, int yrs, double rate) {
		return principle * Math.pow(1 + rate, yrs) - principle;// don't worry about Math.pow()!
	}
	
}