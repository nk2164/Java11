package com.nk2164.basics;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExample {

	public static void main(String[] args) {
		var al = new ArrayList<String>();
		al.add(0,"a");
		al.add(0,"b");
		al.add(0,"c");
		System.out.println(al);
		
		ArrayList<String> am = new ArrayList<>(Arrays.asList(new String[]{"a","b","c","d"}));
		System.out.println(am);
		am.removeAll(al);
		System.out.println(am);

	}
}
