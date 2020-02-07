package com.nk2164.example;

public class CompoundInterestCalculator extends InterestCalculator {
	public Double computeInterest(double principle, double yrs, double rate) {
		return principle * Math.pow(1 + rate, yrs) - principle;
	}
}