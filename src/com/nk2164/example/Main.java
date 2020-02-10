package com.nk2164.example;

import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.function.ToDoubleFunction;

public class Main {

	public static void main(String[] args) {

		ToDoubleFunction<List<Double>> averageCalculator = scores -> {
			Double sum = 0d;

			for (Double nextScore : scores) {
				sum += nextScore;
			}
			return sum / scores.size();
		};

		ToDoubleFunction<List<Double>> highestScoreCalculator = scores -> {
			Double highest = 0d;
			for (Double nextScore : scores) {
				highest = Math.max(highest, nextScore);
			}
			return highest;
		};

		ExamManager examManager = new ExamManager();
		System.out.println("The average score is " + examManager.customCalculation(averageCalculator));
		System.out.println("The highest score is " + examManager.customCalculation(highestScoreCalculator));
		System.out.println("The first score is " + examManager.customCalculation(myScore -> myScore.get(0)));

		DoubleSupplier ds = () -> {
			return 1.2d;
		};

		DoubleSupplier db = () -> {
			return 1.3d;
		};

		System.out.println("The value from ds is " + examManager.returnVal(ds));
		System.out.println("The value from db is " + examManager.returnVal(db));
		System.out.println("Trying out inline input " + examManager.returnVal(() -> {return 2.3d;}));
		
		examManager.printScores();
		
		System.out.println();
		
		System.out.println(examManager.geTotalOfAllScores());
		
		System.out.println();
		List<Double> doubleScores = examManager.doubleAllScores();
		doubleScores.forEach(s -> System.out.println(s));
		
		
	}

}