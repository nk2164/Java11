package com.nk2164.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankAccount implements Iterable<Account> {

	private List<Account> acctList = new ArrayList<Account>();
	
	public void addAccount(Account act) {
		acctList.add(act);
	}
	
	@Override
	public Iterator<Account> iterator() {
		return acctList.iterator();
	}

}
