package com.nk2164.basics;

public class Hello {

	public static void main(String[] args){
		System.out.println("Hello World!");
		
		Object o = "I am a String";
		
//		int i = o.length(); - This wont work since JVM will only allow you to 
//		                      invoke stuff that is in known to object.
		
//		This below code works since we are casting the object to a string.
//		Now it knows all the string methods.
		int i = ((String) o).length();
		System.out.println(i);
		
		ClassB subClass = new ClassB();
		System.out.println(subClass.count);
		System.out.println(subClass.getCount());
		System.out.println();
		System.out.println(((ClassA) subClass).count); // unshadowing
		System.out.println(((ClassA) subClass).getCount()); // unshadowing supertype
	}
}