package com.nk2164.basics;

public class TestClass3 {

	public static void main(String[] args) {
		boolean[] b = new boolean[3];
		for (boolean c : b) {
			System.out.println(c);
		}
		
		int[][][] nums = new int[1][4][2]; 
		
		for( int i = 0; i < nums.length; i ++){ 
			for( int j = 0; j < nums[ i]. length; j ++){
				for (int k = 0; k < nums[ i][ j]. length; k ++){ 
					nums[ i][ j][ k] = i + j + k; 
					System.out.println("num[" + i +"][" + j +"][" + k +"] = "+ nums[i][j][k]); 
					} 
				} 
			}
				
	}
}