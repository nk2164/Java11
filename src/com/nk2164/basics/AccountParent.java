package com.nk2164.basics;

public class AccountParent {
	private String accountNumber;

	public AccountParent() {
		// TODO Auto-generated constructor stub
	}

	public AccountParent(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static void main(String[] args) {
		
		Account simpleAccount = new Account();
		simpleAccount.accountID = "123";
		
		System.out.println("Hello 1 2 3 testing");
	}

	@Override
	public String toString() {
		return "This is account # " + accountNumber;
	}

}
