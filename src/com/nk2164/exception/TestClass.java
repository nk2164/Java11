package com.nk2164.exception;

public class TestClass {

	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.doInterest();
	}

	private  void doInterest() {
		try {
			double interest = computeSimpleInterest(1000.0, 10.0, -1);
			System.out.println("Compound interest is " + interest);
		} catch (IllegalArgumentException e) {
			System.out.println("Problem in computing interest : " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("All done here!");
		}
	}

	private double computeSimpleInterest(double p, double r, int t) {
		if (t < 0) {
			throw new IllegalArgumentException("Time Is less than zero");
		}

		return (p * r * t) / 100;
	}
}
