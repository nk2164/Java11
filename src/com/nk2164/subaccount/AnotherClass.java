package com.nk2164.subaccount;

import com.nk2164.basics.Account;

public class AnotherClass extends SubAccount {

	public static void main(String[] args) {
		SubAccount sa = new SubAccount();
		
		sa.name = "abcs";     //Protected members of a class is accessible from 
		                      //any other class in the same package even if its
        					  //not a subclass.
		
		Account account = new Account();
//		account.accountID = "123";
		
	}
	
	
}
