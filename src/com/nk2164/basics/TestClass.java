package com.nk2164.basics;

public class TestClass {

	public static void main(String[] args) {
		int m = 50; 
		
		int n = ++ m;  // n = 51, m = 51
		
		int o = m--; // o = 51, m = 50
		
		int p = --o + m--; // p = 50 + 50 = 100 , o = 50, m = 49 
		
		int x = m < n? n < o? o < p? p:o:n:m;
		
		System.out.println(x);
		// 49 < 51 ? (51 < 50 ? (50 < 100 ? 100:50);51);49) 
		// 49 < 51 ? 51;49)
		
		
		int k = 4; 
		boolean flag = k++ == 5;
		System.out.println(flag);
		flag = !flag;
		
		
		byte b = 1; 
		//b = b << 1; 
		int c = b << 1; 
		byte d = b; 
		byte e = 0; 
		e += b;

		String s = "a"; 
		String[] sa = { "a", s, s.substring( 0, 1), new String(" a"), "" + 'a' }; 
		
		for( int i = 0; i < sa.length; i ++){ 
			System.out.println( i); 
			System.out.println( s == sa[ i]); 
			System.out.println( s.equals( sa[ i])); 
			}


	}
}