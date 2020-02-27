package com.nk2164.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class SO226 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entry = 0;
		boolean firstime = true;
		ArrayList<Integer> array = new ArrayList<Integer>();

		System.out.println("Make your first entry ");

		while (sc.hasNext()) {
			try {
				entry = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Non Int value - Exiting");
				break;
			}

			if (firstime || (array.get(array.size() - 1) == entry - 1)) {
				firstime = false;
				array.add(entry);
			} else {
				System.out.println("Out of sequence - Exiting!");
				break;
			}

			System.out.println("Make your next entry");
		}

	}

}