package com.nk2164.ocjp11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class GeneralExample {
	
	public List<Integer> books = null;
	
	public GeneralExample() {
		books = new ArrayList<Integer>();
		
		books.add(1);
		books.add(2);
		books.add(3);
		books.add(4);
		books.add(5);
		books.add(6);
		books.add(7);
	}

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
		
		System.out.println("\nThe total is " + getTotal(new GeneralExample().books));
		
		System.out.println();
		doubleAndPrint(new GeneralExample().books);
	}
	
	public static Integer getTotal(List<Integer> books) {
		
		return books.stream().reduce(0,(a,b) -> a+b);
	}
	
	public static void doubleAndPrint(List<Integer> books) {
		books.stream().map(s -> ("I doubled " + s + " to produce " + s*2)).forEach(s -> System.out.println(s));
	}
}
