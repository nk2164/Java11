package com.nk2164.basics;

import java.util.Arrays;
import java.util.Iterator;

public class TestClass4 {

	public static void main(String[] args) {
		doStuff(10);
		doStuff((byte)10); //short version is called since its more closer than int
	}

	public static void doStuff(int var) {
		System.out.println("int called");
	}
	
	public static void doStuff(short var) {
		System.out.println("short called");
	}
}