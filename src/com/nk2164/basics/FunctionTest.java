package com.nk2164.basics;

import java.util.function.Function;

/* A simple class to print hello world 
 * using functional interface. */

public class FunctionTest {

	public static void main(String[] args) {
		System.out.println(printMe(s -> {
			return "Hello " + s;
		}, "World!"));
	}

	public static String printMe(Function<String, String> inp, String name) {
		return inp.apply(name);
	}
}