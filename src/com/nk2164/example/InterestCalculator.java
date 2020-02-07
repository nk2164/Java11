package com.nk2164.example;

class InterestCalculator {

	Number computeInterest(double principle, double yrs, double rate) throws Exception {
		if (yrs < 0)
			throw new IllegalArgumentException(" yrs should be > 0");
		return principle * yrs * rate;
	}
	
}