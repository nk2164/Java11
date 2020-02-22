package com.nk2164.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsCheck {

	private List<Double> myScores;

	public CollectionsCheck() {
		myScores = new ArrayList<Double>();
		myScores.add(78.3);
		myScores.add(69.2);
		myScores.add(44.7);
		myScores.add(61.6);
		myScores.add(80.2);
		myScores.add(66.9);
		myScores.add(54.1);
	}
	
	private void printAll(List<Double> q) {
		q.forEach((Double s) -> System.out.println(s));
	}

	public static void main(String[] args) {
		CollectionsCheck cs = new CollectionsCheck();

		System.out.println(cs.myScores);
		
		Collections.sort(cs.myScores, (arg0, arg1) -> {
			return arg0 == arg1 ? 0 : (arg0 > arg1 ? -1 : 1);
		});
		
		System.out.println(cs.myScores);
		
		cs.printAll(cs.myScores);
	}
}
