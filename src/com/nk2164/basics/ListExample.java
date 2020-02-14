package com.nk2164.basics;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add(al.size()+1,"x");
		System.out.println(al);

	}
}