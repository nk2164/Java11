package com.nk2164.basics;

public class LambdaExample {

	@FunctionalInterface
	public interface MyLambdaInterface{
		public void printIt(String s,Integer i); //Abstract method that takes a string and integer
	}
	
	public static void printStuff(MyLambdaInterface input) {
		input.printIt("Matt", 10);
	}
	
	public static void main(String[] args) {
		MyLambdaInterface input1 = (String s,Integer i) -> {
			System.out.println("Hello "+ s);
			System.out.println("I met you like " + i + " times already!!");
		};
		
		MyLambdaInterface input2 = (String s,Integer i) -> {
			System.out.println("Howdy "+ s);
			System.out.println("How is your " + i + " year old doing ?");
		};
		
		printStuff(input1);
		printStuff(input2);
	}
}
