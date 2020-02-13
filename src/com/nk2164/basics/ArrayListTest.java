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
		
		List<String> origList = List.of("a", "b", "c"); //Returns an unmodifiable list
		List<String> copyList = List.copyOf(origList);  //Returns an unmodifiable list
		
//		origList.add("d"); - > Can't do this 
//		copyList.add("d"); - > Can't do this
		
		ls.forEach(System.out::println);
		origList.forEach(System.out::println);
		copyList.forEach(System.out::println);
		
	}
}
