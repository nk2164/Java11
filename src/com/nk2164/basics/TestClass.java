package com.nk2164.basics;

public class TestClass {

	public static final boolean DEBUG = false;
	
	public static Bird b;
	public static int i = 20;
	
	public static void main(String[] args) throws Exception {
//		int x = 0;
//		if (x == 0) {
//			throw new Exception();
//		}
//		x = 20;// unreachable code here but no compilation error
		
//		b = new Bird();
//		System.out.println(b.s);
//		System.out.println(i);
//		addCount(1);
		
//		String str1 = "Hello";
//		String str2 = new String("Hello");
//		String str3 = str2.intern();
//		System.out.println(str1 == str2);
//		System.out.println(str1 == str3);
		

		
		String s1 = "abc";
		String s2 = " abc".stripLeading();
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
	}

	public void method() {
		if (DEBUG) {
			System.out.println(" debug statement here");
		} // works
	}

	public static int count = 20;
	
	public static int addCount(int x) {
		final int count = 1;
		System.out.println(count);
		return 0;
	}

}
