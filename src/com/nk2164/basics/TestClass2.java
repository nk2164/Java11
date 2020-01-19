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

//		int[] ia1 = {0, 1, 2, 6}; 
//		int[] ia2 = {0, 1, 2}; 
//		System.out.println( Arrays.compare( ia1, ia2)); // prints -1
//		System.out.println(Arrays.mismatch(ia1, ia2));
//
//		int[][] ia = new int[3][];

		int[][] ia = new int[3][];

		ia[0] = new int[] { 1 };
		ia[1] = new int[] { 1, 2 };
		ia[2] = new int[] { 1, 2, 3 };
		String sa, sb, sc;
		boolean saf, sbf, scf;

		for (int[] is : ia) {
			sa = sb = sc = "";
			saf = sbf = scf = false;

			for (int is2 : is) {
				if (!saf) {
					sa = Integer.toString(is2);
					saf = true;
				} else if (!sbf) {
					sb = Integer.toString(is2);
					sbf = true;
				} else if (!scf) {
					sc = Integer.toString(is2);
					scf = true;
				}
			}

			if (saf & sbf & scf) {
				System.out.printf("%s  %s  %s \n", sa, sb, sc);
			} else if (saf & sbf) {
				System.out.printf(" %s  %s   \n", sa, sb);
			} else {
				System.out.printf("   %s     \n", sa);
			}

		}

	}
}
