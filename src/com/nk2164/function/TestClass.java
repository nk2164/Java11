package com.nk2164.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestClass {
	
	public static void main(String[] args) {
		Consumer<String> sc = s -> System.out.println(s);
		sc.accept("Hello World!");
		
		String[] strArray = {"Experimenting","with","supplier","Interface"};
		
		System.out.println(getData(() -> new String[] {"Hello","World"}));
		System.out.println(getData(() -> new String[] {"How","are","you?"}));
		System.out.println(getData(() -> new String[] {"see","how ","cool","this","is?"}));
		System.out.println(getData(() -> strArray));
		
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "Hello");
		myMap.put(2, "World!");
		myMap.forEach((k,v) -> System.out.println("The key " + k + " is mapped to " + v));

		List<String> myList = new ArrayList<>();
		myList.add("Experimenting");
		myList.add("with");
		myList.add("supplier");
		myList.add("string");
		System.out.println(myList);
		myList.removeIf(s -> s.equals("supplier"));
		System.out.println(myList);
		
	}
	
	public static List<String> getData(Supplier<String[]> s){
	  List<String> output = Arrays.asList(s.get());
	  return output;
	}

}