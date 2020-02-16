package com.nk2164.function;

import java.util.function.Consumer;

public class TestClass {
	
	public static void main(String[] args) {
		Consumer<String> sc = s -> System.out.println(s);
		sc.accept("Hello World!");
	}

}
