package com.nk2164.basics;

public class TriangularMatrix {

	public static void main(String[] args) {

		for (int i = 0, j = 0; i < 3; i++) {
			System.out.printf("(%s,%s = %s) (%s,%s = %s) (%s,%s = %s) \n", i, j, (i + j), i, j + 1, (i + j + 1), i,
					j + 2, (i + j + 2));
		}

		int[] ia = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // an array of ints of size 10
		boolean[] ba = { true, false, false }; // an array of booleans of size 3
		String[] stra = { " a", "b", "c", "d", "e" }; // an array of Strings of size 5
		Account[] ta = { new Account(), new Account(), new Account(), new Account(), new Account() };

//		int[] iaaa = new int[0];
//		System.out.println(iaaa[0]); // Gives an array index out of bounds exception
		
		System.out.println(ia.getClass().getName() + " , " + ia.getClass().getSuperclass().getName());
		System.out.println(ba.getClass().getName() + " , " + ba.getClass().getSuperclass().getName());
		System.out.println(stra.getClass().getName() + " , " + stra.getClass().getSuperclass().getName());
		System.out.println(ta.getClass().getName() + " , " + ta.getClass().getSuperclass().getName());

		int[] a1 = {10,20,30,40,50};
		int[] a2 = (int[])(a1.clone());

		System.out.println(a2[4]);
	}

}
