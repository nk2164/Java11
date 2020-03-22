package com.d84u.ocjp11;

public class GeneralExample {
	//Define the interface
	@FunctionalInterface
	interface LambdaInterface {
		void someMethod(String s,Integer i);
	}
	
	//Define a method that would take in that interface
	public static void doSomething(LambdaInterface someLambda,String s, Integer i) {
		someLambda.someMethod(s, i);
	}

	public static void main(String[] args) {
		
		//provide an implementation using lambda expression
		LambdaInterface someLambda = (s , i) -> {
			System.out.println("Hello " + s + " !");
			System.out.println(s + " has " + i + " teeth!");
		};
		
		doSomething(someLambda, "John", 10);
		doSomething(someLambda, "Greg", 10);
		
		System.out.println();
		
		LambdaInterface anotherLambda = (s , i) -> {
			System.out.println("My name is " + s + " !");
			System.out.println("I have " + i + " teeth!");
		};
		
		doSomething(anotherLambda, "John", 10);
		doSomething(anotherLambda, "Greg", 10);
		
	}
}
