package com.nk2164.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionTest1 {
	public boolean isItLowerThan50(Double d) {
		return (d < 50);
	}
	
	List<Double> myList = new ArrayList<Double>();
	
	public FunctionTest1() {
		myList.add(10.00);
		myList.add(20.00);
		myList.add(30.00);
		myList.add(40.00);
		myList.add(50.00);
		myList.add(60.00);
		myList.add(70.00);
	}
	
	private void printMe(Predicate<Double> testCriteria) {

		myList.stream().filter(testCriteria).forEach(s -> System.out.println(s));
		
//		myList.forEach(s -> {
//			if (testCriteria.test(s)) {
//				System.out.println(s);
//			}
//		});
	}
	
	public static void main(String[] args) {
		FunctionTest1 f1 = new FunctionTest1();
		f1.printMe(s -> s > 10.00);
		System.out.println();
		f1.printMe(s -> s >= 50.00);
		System.out.println();
		f1.printMe(f1::isItLowerThan50);
	}
}
