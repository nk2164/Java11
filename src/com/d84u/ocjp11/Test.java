package com.d84u.ocjp11;

public class Test {
	public static void main(String[] args) {
		byte day = 10;
		switch (day + 1) { //now its ok since day + 1 is an int due to numeric promotion .
		case 300:
			System.out.println("BUY 2 GET 1 FREE");
			break;
		default:
			System.out.println("SORRY!!! NO SALE");
		}
	}
}