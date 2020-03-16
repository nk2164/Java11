package com.nk2164.basics;

public class Test {
	public static void main(String[] args) {
		for (int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
			System.out.println(x + y + z);
		}
		
		int y;
		int z;
		int x = 2 + (y = 2 + (z = 3 + 5)); //learning more about expressions
		System.out.println(x);
	}
}