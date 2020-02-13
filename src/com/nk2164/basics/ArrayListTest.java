package com.nk2164.basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("zero");
		ls.add("one");
		ls.add("two");
		ls.add("three");
		ls.add("four");
		ls.add("five");
		ls.add("six");
		ls.add("seven");
		
		System.out.println(ls.size());
		List<String> subL = ls.subList(8, 8);
		System.out.println(subL);
		
		String[] strArray = ls.toArray(new String[10]);
		System.out.println(strArray.length);
	}
}
