package com.nk2164.basics;

public class ClassTest {

	static void add(int[] i) {
		int sum = 0;
		for(int a: i) {
			sum += a;
		}
		System.out.println("In method 1");
		System.out.println("Sum is " + sum);
	}
	
	static void add(Integer... i) {
		int sum = 0;
		for(int a: i) {
			sum += a;
		}
		System.out.println("In method 2");
		System.out.println("Sum is " + sum);
	}
	
	public static void main(String[] args) {
		add(new int[] {1,2,3,4,5});
		add(new Integer[] {1,2,3,4,5});
	}

}
