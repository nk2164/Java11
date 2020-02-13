package com.nk2164.basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("Hello");
		String testString = new String("Hello");
		System.out.println(ls.contains(testString));
	}
}
