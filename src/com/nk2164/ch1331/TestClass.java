package com.nk2164.ch1331;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("alice");
		al.add("bob");
		al.add("charlie");
		al.add(2,"david");
		al.remove(0);
		
		for (String str : al) {
			System.out.println(str.toString() + " "  + str.length());
		}
		
		//Dump contents of the list
		System.out.println("All names : "+ al);
	}
}
