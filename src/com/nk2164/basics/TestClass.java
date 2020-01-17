package com.nk2164.basics;

public class TestClass {

	static int count = 5, sum = 0;

	public static void main(String[] args) {

		doStuff();

		int a = 0, b = 0, c = 10, d = 0;

		boolean flag = true;

		if (a == b)

			if (c == 10) {
				if (d > a) {
				} else {
				}

				if (flag)
					System.out.println("I came here");
				else
					System.out.println("No i came here");
			} else if (flag == false)
				System.out.println("");
			else if (a + b < d) {
				System.out.println("");
			} else
				System.out.println("");
		else
			d = b;

	}

	public static void doStuff() {
		while (count > 0) {
			switch (count) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				sum += count--;
				break;
			default:
				break;
			}
		}
		System.out.println("Sum is " + sum);
	}

}