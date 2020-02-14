package com.nk2164.basics;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {

		var list1 = new ArrayList <String>(); 
		var list2 = new ArrayList <String>(); 
		
		list1.add("a"); list1. add("b"); 
		list2.add("b"); list2. add("c"); list2.add("d"); 
		
		list1.addAll(list2); 
		list1.remove("b"); 
		System.out.println( list1);


	}
}