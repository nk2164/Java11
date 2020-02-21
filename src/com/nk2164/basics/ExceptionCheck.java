package com.nk2164.basics;

public class ExceptionCheck {
	public static void main(String[] args) {
		System.out.println("Throwing a new error :)");
		throw new Error("Ok I cant go on any further!!");
	}

	double computeSimpleInterest(double p, double r, double t) throws Exception {
		if (t < 0)
			throw new Exception(" time is less than 0");
		return t;
	}
}