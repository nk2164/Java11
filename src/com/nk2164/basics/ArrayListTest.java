package com.nk2164.basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(0, 1);
		li.add(0, 2);
		li.add(0, 3);
		System.out.println(li);
	}
}
