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
		
		int[] a1 = {10,20,30,40};
		int[] a2 = {10,20,30,40};
		
		System.out.println(Arrays.compare(a1, a2));
		System.out.println(Arrays.mismatch(a1, a2));
	}
}
