package com.nk2164.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListExample {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		list1.addAll(list2);
//		list1.removeAll("b"); - Remove all takes only collection
		System.out.println(list1);
		
		Map<Integer, String>  studentDetail = new HashMap<>();
		studentDetail.put(1, "AB");
		studentDetail.put(1, "CD");
		studentDetail.put(1, "EF");
		studentDetail.put(1, "GH");
		studentDetail.put(1, "IJ");
		studentDetail.put(1, "KL");
		
		System.out.println(studentDetail.get(0));
	}
}