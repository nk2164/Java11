package com.nk2164.basics;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		int a = 10;
		Integer b = 20;
		char ch = 'a';
		Double d = 10.0;
		Boolean flag = false;

		System.out.println(a == b); // comparing an int with an Integer,
									// prints false because 10 is not equal to 20

		System.out.println(a == 10.0); // comparing an int with a double,
										// prints true because Java considers 10 and 10.0 as equal

		System.out.println(a == ch); // comparing an int with a char, prints false
										// because 10 is not equal to 'a'

		System.out.println(97 == ch); // comparing an int with a char, prints true because
										// int value of 'a' is indeed 97

		System.out.println(a != d); // comparing an int with a Double, prints false
									// because a and d have the same value

		System.out.println(a != 10); // comparing two ints, prints false because a is 10

		System.out.println(false != flag); // comparing a boolean with a Boolean,
											// prints false because flag is false

	}

}