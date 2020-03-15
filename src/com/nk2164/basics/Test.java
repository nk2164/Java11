package com.nk2164.basics;

class Test {

	public static void main(String[] args) {
		for (var i = 1; i < 11; i++) {
			System.out.println("Count is: " + i);
		}

		System.out.println();
		
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (var item : numbers) {
			System.out.println("Count is: " + item);
		}
		
//		var a = 2, b = 3; - will fail with message 'var' is not allowed in a compound declaration
	}
}