package com.nk2164.basics;

public class ScopeTest {

	String[] args = new String[0];
	
	public static void main(String[] args) {
		args = new String[args.length];
		for (var arg : args) {
			System.out.println(arg);
		}
		var arg = args[0];
		System.out.println(arg);
	}
}
