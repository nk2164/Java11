package com.nk2164.basics;

public class TriangularMatrix {

	public static void main(String[] args) {

		for (int i = 0, j = 0; i < 3; i++) {
			System.out.printf("(%s,%s = %s) (%s,%s = %s) (%s,%s = %s) \n", i, j, (i + j), i, j + 1, (i + j + 1), i,
					j + 2, (i + j + 2));
		}

		int[] ia[] = new int[10][10];
		boolean[] ba = new boolean[3];
		String[] stra = new String[5];
		TestClass[] ta = new TestClass[5];

		System.out.println(ia.getClass().getName() + " , " + ia.getClass().getSuperclass().getName());
		System.out.println(ba.getClass().getName() + " , " + ba.getClass().getSuperclass().getName());
		System.out.println(stra.getClass().getName() + " , " + stra.getClass().getSuperclass().getName());
		System.out.println(ta.getClass().getName() + " , " + ta.getClass().getSuperclass().getName());

	}

}
