package com.nk2164.basics;

import java.lang.invoke.StringConcatException;
import java.net.URISyntaxException;

public class SubClass extends SuperClass {

	public SubClass() throws StringConcatException , ClassNotFoundException , URISyntaxException {
		super();
	}

	public void someMethod() throws StringConcatException , ClassNotFoundException , URISyntaxException {
		System.out.println("some code");
	}
}
