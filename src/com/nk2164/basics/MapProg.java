package com.nk2164.basics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapProg {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Hi");
		map1.put(2, "my");
		map1.put(3, "name");
		map1.put(4, "is");
		map1.put(5, "Isabel");
		map1.put(6, "Jean");
		
		System.out.println(map1.get(1));
		map1.remove(1); // Removed the element with key 1
		System.out.println(map1.get(1)); // getting return null because 
										 // that element is not there.	
		Set<Integer> keys = map1.keySet();
		keys.forEach(System.out::println);
		
		Collection<String> col = map1.values();
		
		col.forEach(System.out::println);
		System.out.println(map1.size());
	}
}
