package com.nk2164.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionsCheck {

	private List<Double> myScores;

	public static boolean isItLowerThan50(Double d) {
		return d <= 50;
	}
	
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

	public double getTotalAllScores(List<Double> q) {
		return q.stream().reduce(0d, (a, b) -> a + b);
	}
	
	public List<Double> printSelectedScore(Predicate<Double> p) {
		return myScores.stream().filter(p).collect(Collectors.toList());
	}
	
	public static List<Double> doubleMyScores(List<Double> q) {
//		q.stream().mapToDouble(s -> 2*s).forEach(s -> q2.add(s));
		
		return q.stream().map(s -> 2*s).collect(ArrayList::new, ArrayList::add,ArrayList::addAll);
				
//		return q.stream().map(s -> 2*s).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		CollectionsCheck cs = new CollectionsCheck();
		
//		cs.printAll(cs.myScores);
		
		cs.printSelectedScore(CollectionsCheck::isItLowerThan50).forEach(System.out::println);
		
//		System.out.println(cs.myScores);

//		Collections.sort(cs.myScores, (arg0, arg1) -> {
//			return arg0 == arg1 ? 0 : (arg0 > arg1 ? -1 : 1);
//		});
//
//		System.out.println(cs.myScores);
//
//		
//		System.out.println("The total of all scores is " + cs.getTotalAllScores(cs.myScores));
//		
//		System.out.println(doubleMyScores(cs.myScores));
	}
}
