package com.nk2164.hiding;

class CompoundInterestCalculator extends InterestCalculator {
	public int yrs = 20;
	public static double rate = 0.2;

	@Override
	public String getClassName() {
		return "CompoundInterestCalculator";
	}
}