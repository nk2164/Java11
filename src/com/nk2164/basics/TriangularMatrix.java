package com.nk2164.basics;

public class TriangularMatrix {

	public static void main(String[] args) {
		int k;// j is an int 
		int[] ia1, ia2; // ia1 and ia2 are one dimensional arrays of ints 
		int[][] iaa; // iaa is a two dimensional array of ints and so on
		
		for (int i = 0,j =0; i < 3; i++) {
			System.out.printf("(%s,%s = %s) (%s,%s = %s) (%s,%s = %s) \n", i,j,(i+j),i,j+1,(i+j+1),i,j+2,(i+j+2));
		}
	}

}
