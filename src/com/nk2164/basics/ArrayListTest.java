package com.nk2164.basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add(null);
		ls.add("Hello");
		ls.removeAll(ls);
		System.out.println(ls.size());
	}
}
