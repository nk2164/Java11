package com.nk2164.basics;

import java.util.Arrays;
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

		// same code above with for each
//		for (Account act : ba) {
//			System.out.println(act.toString());
//			if (act.equals(act3)) {
//				System.out.println("I'm out after acount 13");
//				continue;
//			}
//		}

//		ba.forEach(System.out :: println);

		String[][] groups = { { "ally", "bob", "charlie"}, 
				              { "bob", "alice", "boone"}, 
				              { "chad", "dave", "elliot"} };

		MY_OUTER_LOOP: for (int i = 0; i < groups.length; i++) {
			for (String name : groups[i]) {
				System.out.println(" Checking " + name);
				if ("bob".equals(name)) {
					System.out.println(" Found bob in Group " + (i+1) + " " + Arrays.toString(groups[i]));
					continue MY_OUTER_LOOP;
				}
			}
		}
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

		while (i-- > 0)
			System.out.println(" i is " + i); // no curly braces

		System.out.println(" Value of i after the loop is " + i);
	}

	static private void doWhile() {
		int i = 4;

		do
			System.out.println(" i is " + i);
		while (i-- > 0);

		System.out.println(" Loop finished. i is " + i);
	}

	static private void myForLoop() {
		int i = 4;

		for (System.out.println("Starting loop now"); i > 0; System.out.println(i), i--)
			;

		System.out.println("Loop finished. i is " + i);

		boolean b = false;
		for (i = 0; b = !b;) {
			System.out.println(i++);
		}

	}

}