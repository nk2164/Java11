package com.nk2164.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestClass {

	static Map<String, String> idNameMap = new HashMap<>();
	static List<String> keys = new ArrayList<String>(List.of("0", "1", "2"));
	static List<String> values = new ArrayList<String>(List.of("a", "b", "c"));

	public static void buildMap() {
		for (int i = 0; i < keys.size(); i++) {
			idNameMap.put(keys.get(i), values.get(i));
		}
		System.out.println(idNameMap);

	}
	
	public static void main(String[] args) {
		buildMap();
		System.out.println(idNameMap.get("2"));
		System.out.println();
		keys.clear();
		System.out.println(keys.size());
		System.out.println(idNameMap.size());
		idNameMap.remove("1");
		System.out.println(idNameMap);
		idNameMap.clear();
		System.out.println(idNameMap);
	}
}
