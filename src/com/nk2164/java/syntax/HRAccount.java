package com.nk2164.java.syntax;

import com.nk2164.basics.Account;
import com.nk2164.subaccount.SubAccount;

public class HRAccount extends Account {

	public static void main(String[] args) {
		Account simpleAccount = new Account();
//		simpleAccount.accountID = "";
		
		HRAccount hrAccount = new HRAccount();
		hrAccount.accountID = "100";
		
		SubAccount subaccnt = new SubAccount();
//		subaccnt.accountID = "123";
	}

}