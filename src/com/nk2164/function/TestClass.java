package com.nk2164.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestClass {

	public static void main(String[] args) {
		Consumer<String> sc = s -> System.out.println(s);
		sc.accept("Hello World!");

		String[] strArray = { "Experimenting", "with", "supplier", "Interface" };

		System.out.println(getData(() -> new String[] { "Hello", "World" }));
		System.out.println(getData(() -> new String[] { "How", "are", "you?" }));
		System.out.println(getData(() -> new String[] { "see", "how ", "cool", "this", "is?" }));
		System.out.println(getData(() -> strArray));

		Map<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "Hello");
		myMap.put(2, "World!");
		myMap.forEach((k, v) -> System.out.println("The key " + k + " is mapped to " + v));

		List<String> myList = new ArrayList<>();
		myList.add("Experimenting");
		myList.add("with");
		myList.add("supplier");
		myList.add("string");
		System.out.println(myList);
		myList.removeIf(s -> s.equals("supplier"));
		System.out.println(myList);

		List<Integer> myIntList = new ArrayList<>();
		myIntList.add(4);
		myIntList.add(3);
		myIntList.add(2);
		myIntList.add(1);
		System.out.println(myIntList);
		myIntList.sort((firstArg, secondArg) -> firstArg.compareTo(secondArg));
		System.out.println(myIntList);
		
		// Reversig the sort - note the - 
		myIntList.sort((firstArg, secondArg) -> - firstArg.compareTo(secondArg));
		System.out.println(myIntList);

		List<String> games = new ArrayList<>(List.of("football", "cricket", "baseball", "tennis"));
		games.sort((a, b) -> a.compareTo(b));
		games.forEach(s -> System.out.println(s));

		System.out.println();
		
		List<String> names = Arrays.asList(new String[] {"alex","bob","casey","abel"});
		for(String n: names) {
			Predicate<String> p = q -> q.startsWith("a");
			if (p.test(n)) {
				System.out.println(n);
			}
		}
		
		System.out.println();
		
		List<String> names1 = Arrays.asList(new String[] {"alex","bob","casey","abel"});
		
		int x = 0;
		for (String n: names1) {
			Predicate<String> q = k -> {
				System.out.println(n);
				return k.startsWith("a");
			};
			
			System.out.println(q.test(n));
		}
		x += 1;
	}

	public static List<String> getData(Supplier<String[]> s) {
		List<String> output = Arrays.asList(s.get());
		return output;
	}

}