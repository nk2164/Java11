package com.nk2164.threads;

import java.util.Arrays;
import java.util.List;

public class NumbersTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Task " + Thread.currentThread().getName() + " has started" );
		
		List<Integer> myList = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		myList.forEach(System.out::println);

		try {
			int randomDelay = (int) Math.random() * 500 + 1;
			Thread.sleep(randomDelay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Task " + Thread.currentThread().getName() + " has finished " );
	}

}
