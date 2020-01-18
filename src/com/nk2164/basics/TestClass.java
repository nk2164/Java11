package com.nk2164.basics;

import java.util.Iterator;

public class TestClass {

	static int count = 5, sum = 0;

	public static void main(String[] args) {

//		doStuff1();
//		dostuff2();
//		doWhile();
//		myForLoop();
		Account act1 = new Account("11");
		Account act2 = new Account("12");
		Account act3 = new Account("13");
		Account act4 = new Account("14");
		
		BankAccount ba = new BankAccount();
		ba.addAccount(act1);
		ba.addAccount(act2);
		ba.addAccount(act3);
		ba.addAccount(act4);
		
//		Iterator<Account> baIterator = ba.iterator();
//		Account act;
//		while(baIterator.hasNext()) {
//			act = baIterator.next();
//			System.out.println(act.toString());
//		}
		
//		// same code above with for each
//		for (Account act : ba) {
//			System.out.println(act.toString());
//		}
		
		ba.forEach(System.out :: println);
	}

	public static void doStuff1() {
		int i = 4;

		while (i > 0) {
			i--;
			System.out.println(" i is " + i);
		}

		System.out.println(" Value of i after the loop is " + i);
	}
	
	private static void dostuff2() {
		int i = 4; 
		
		while(i-- > 0) System.out.println(" i is "+ i); // no curly braces 
		
		System.out.println(" Value of i after the loop is "+ i); 
	}
	
	static private void doWhile() {
		int i = 4; 
		
		do System.out.println(" i is "+ i); 
		while( i--> 0); 
		
		System.out.println(" Loop finished. i is "+ i);
	}
	
	static private void myForLoop() {
		int i = 4;
		
		for (System.out.println("Starting loop now"); i > 0; System.out.println(i),i--);
		
		System.out.println("Loop finished. i is "+ i);
		
		boolean b = false; 
		for(i = 0 ; b = !b ; ) { System.out.println(i++); }

	}

}