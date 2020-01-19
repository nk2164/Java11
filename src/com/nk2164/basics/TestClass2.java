package com.nk2164.basics;

import java.util.Arrays;

public class TestClass2 {

	public static String field1 = "Hello World!";
	public String field2 = "How are you doing ?";

	public static void main(String[] args) {

//		AccountParent[] sa = {new Account()};
//		AccountParent[] oa = sa;
//		oa[0] = new AccountParent();
//		
//		Integer[] la = {10,20,30,40};
//		Object[] ia = la;
//		ia[0] = new Account();
		
//		int[] a1 = {111,110,112};
//		int[] a2 = {111,111,111};
//		
//		System.out.println(Arrays.compare(a1, a2));
//		System.out.println(Arrays.mismatch(a1, a2));
		
		int[] ia1 = {0, 1, 2, 6}; 
		int[] ia2 = {0, 1, 2}; 
		System.out.println( Arrays.compare( ia1, ia2)); // prints -1
		System.out.println(Arrays.mismatch(ia1, ia2));

		
	}
}
