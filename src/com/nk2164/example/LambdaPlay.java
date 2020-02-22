package com.nk2164.example;

public class LambdaPlay {
	@FunctionalInterface
	interface LambdaInterface {
		void someMethod(String s,Integer i);
	}

	static void printSomething(LambdaInterface l) {
		l.someMethod("Steve",1);
	}
	
	public static void main(String[] args) {
		printSomething((i,j) -> {
			System.out.println("Hello " + i + " You have " + j + " candy! ");
		});
		
		printSomething((i,j) -> {
			System.out.println("Hola " + i + " Did you say you had " + j + " candy? ");
		});
	}
}
