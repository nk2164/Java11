package com.nk2164.java.syntax;

import com.nk2164.basics.Account;

public class HRAccount extends Account {

	public static void main(String[] args) {
		Account simpleAccount = new HRAccount();
		//simpleAccount.accountID = 0;
		
		HRAccount hrAccount = new HRAccount();
		hrAccount.accountID = "100";
	}

}