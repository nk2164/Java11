package com.nk2164.basics;

import java.lang.invoke.StringConcatException;
import java.net.URISyntaxException;

public class MainClass {

	public static void main(String[] args) {

		try {
			SuperClass sc = new SubClass();
			mainMethod(sc);
		} catch (ClassNotFoundException | StringConcatException | URISyntaxException e) {
			e.printStackTrace();
		}

		try {
			SuperClass sc2 = new SuperClass();
			mainMethod(sc2);
		} catch (StringConcatException e) {
			e.printStackTrace();
		}

	}

	public static void mainMethod(SuperClass input) {

		try {
			input.someMethod();
		} catch (ClassNotFoundException | StringConcatException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
