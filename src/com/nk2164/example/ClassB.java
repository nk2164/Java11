package com.nk2164.example;

public class ClassB extends ClassA {

	static int count;
	
	public static void main(String[] args) {
		
		ClassB B = new ClassB();
		ClassA A = B;
		
		B.printmeStatic();
		B.printmeInstance();
		System.out.println();
		A.printmeStatic();
		A.printmeInstance();
	}
	
	public static void printmeStatic() {
		System.out.println("class B's printmeStatic");
	}
	
	public void printmeInstance() {
		System.out.println("class B's printmeInstance");
	}
}
