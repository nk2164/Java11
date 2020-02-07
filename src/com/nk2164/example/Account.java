package com.nk2164.example;

class Account {
	double balance;
	double rate;

	Account(double balance, double rate) {
		this.balance = balance;
		this.rate = rate;
	}

	double getInterest(InterestCalculator ic, double yrs) {
		try {
			Number n = ic.computeInterest(balance, yrs, rate);
			return n.doubleValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0.0;
	}
}