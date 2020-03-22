package com.nk2164.ocjp11;

import java.util.function.BiConsumer;

public class GeneralExample {

	//Define a function that takes a built in functional interface
	public static void doSomething(BiConsumer<String, Integer> someLambda, String t,Integer i) {
		someLambda.accept(t, i);
	}

	public static void main(String[] args) {
		
		//provide an implementation using lambda expression
		BiConsumer<String,Integer> someLambda = (s , i) -> {
			System.out.println("Hello " + s + " !");
			System.out.println(s + " has " + i + " teeth!");
		};
		
		doSomething(someLambda, "John", 10);
		doSomething(someLambda, "Greg", 10);
		
		System.out.println();
		
		BiConsumer<String,Integer> anotherLambda = (s , i) -> {
			System.out.println("My name is " + s + " !");
			System.out.println("I have " + i + " teeth!");
		};
		
		doSomething(anotherLambda, "John", 10);
		doSomething(anotherLambda, "Greg", 10);
		
	}
}
