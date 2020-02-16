package com.nk2164.function;

import java.util.Arrays;
import java.util.List;
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
		
	}
	
	public static List<String> getData(Supplier<String[]> s){
	  List<String> output = Arrays.asList(s.get());
	  return output;
	}

}