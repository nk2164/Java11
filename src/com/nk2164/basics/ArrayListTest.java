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
		
		List<String> subL = ls.subList(1, 3);
		System.out.println(subL);
		
		List<String> origList = List.of("a", "b", "c");
		List<String> copyList = List.copyOf(origList);
		copyList.add("d");
		System.out.println(origList);
		System.out.println(copyList);
	}
}
