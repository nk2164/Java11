package com.nk2164.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.function.ToDoubleFunction;

public class ExamManager {

	private List<Double> myScores;

	public ExamManager() {
		myScores = new ArrayList<Double>();
		myScores.add(78.3);
		myScores.add(69.2);
		myScores.add(44.7);
		myScores.add(61.6);
		myScores.add(80.2);
		myScores.add(66.9);
		myScores.add(54.1);
	}

	public Double customCalculation(ToDoubleFunction<List<Double>> calculator) {
		return calculator.applyAsDouble(myScores);
	}

	public Double returnVal(DoubleSupplier ds) {
		return ds.getAsDouble();
	}

	public void printScores() {

		Collections.sort(myScores, (o1, o2) -> {
			int result = 0;
			if (o1 < o2)
				result = 1;
			if (o2 < o1)
				result = -1;
			return result;
		});

		myScores.forEach(s -> System.out.println(s));
	}

}
