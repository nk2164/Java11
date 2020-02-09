package com.nk2164.example;

public class DummyAccount extends Account {

	DummyAccount(double balance) {
		super(balance);
	}

	public void printBalance() {
		System.out.println("No Balance in dummy account!");
	}
}
