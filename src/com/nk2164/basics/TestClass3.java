package com.nk2164.basics;

public class TestClass3 {

	public static void main(String[] args) {
		boolean[] b = new boolean[3];
		for (boolean c : b) {
			System.out.println(c);
		}

		int[][][] nums = new int[1][4][2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				for (int k = 0; k < nums[i][j].length; k++) {
					nums[i][j][k] = i + j + k;
					System.out.println("num[" + i + "][" + j + "][" + k + "] = " + nums[i][j][k]);
				}
			}
		}

		System.out.println(average(0, new int[] { 20, 20, 20, 20, 20 }));

	}

	public static double average(int temp, int... values) {
		/*
		 * by the way, can you tell what will happen if sum is declared as int? Expect
		 * questions in the exam that seem to be about one topic but are actually about
		 * something entirely different.
		 */
		int sum = 0;
		for (int i = 0; i < values.length; i++)
			sum += values[i];
		return values.length == 0 ? 0 : sum / values.length;
	}

	public static double average(String temp, int... values) {
		/*
		 * by the way, can you tell what will happen if sum is declared as int? Expect
		 * questions in the exam that seem to be about one topic but are actually about
		 * something entirely different.
		 */
		int sum = 0;
		for (int i = 0; i < values.length; i++)
			sum += values[i];
		return values.length == 0 ? 0 : sum / values.length;
	}
}