package com.nk2164.threads;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main Thread Starting");
		NumbersTask task = new NumbersTask();

		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(task);
			t.start();

		}

		System.out.println("Main Thread Finished");
	}

}
