package com.nk2164.example;

public class DummyAccount extends Account {

	DummyAccount(double balance) {
		super(balance);
		System.out.println("init done");
	}

	public void printBalance() {
		System.out.println("No Balance in dummy account!");
	}
}
