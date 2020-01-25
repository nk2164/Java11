package com.nk2164.basics;

public class TestClass4 {

	public static void main(String[] args) {
		doStuff(10); //Auto boxing is considered before
		             //varargs
	}

	public static void doStuff(int...var) {
		System.out.println("var args called");
	}
	
	public static void doStuff(Integer var) {
		System.out.println("Auto boxed");
	}
	
}