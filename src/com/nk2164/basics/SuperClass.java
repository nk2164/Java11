package com.nk2164.basics;

import java.lang.invoke.StringConcatException;
import java.net.URISyntaxException;

public class SuperClass {

	public SuperClass() throws StringConcatException {
		if (Math.random() > 0.5) {
			throw new StringConcatException("String not valid");
		}
	}

	public SuperClass(int x) {

	}

	public void someMethod() throws StringConcatException, ClassNotFoundException, URISyntaxException {

		if (Math.random() > 0.5) {
			throw new StringConcatException("String not valid");
		}
	}
}
