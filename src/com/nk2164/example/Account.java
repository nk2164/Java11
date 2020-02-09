package com.nk2164.example;

class Account {
	double balance = 0.0;

	Account(double balance){
		this.balance = balance;
		this.printBalance();
	}

	void printBalance() {
		System.out.println(balance);
	}
}