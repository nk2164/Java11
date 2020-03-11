package com.nk2164.basics;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(25);
		list.add(15);
		list.add(25);
		list.remove(Integer.valueOf(15));

		System.out.println(list);
		System.out.println(Integer.valueOf(15));
	}
}
