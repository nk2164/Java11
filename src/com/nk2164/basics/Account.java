package com.nk2164.basics;

public class Account {
	private String accountNumber;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
		public static void main(String[] args) {
		System.out.println("Hello 1 2 3 testing");
	}
	
	@Override
	public String toString() {
		return "This is account # " + accountNumber;
	}

}

