package com.nk2164.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapProg {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Hi");
		map1.put(1, "my");
		map1.put(1, "name");
		map1.put(1, "is");
		map1.put(1, "Isabel");
		map1.put(1, "Jean");
		
		System.out.println(map1.get(1));
		
		Set<Integer> ks = new TreeSet<>();
		
	}
}
