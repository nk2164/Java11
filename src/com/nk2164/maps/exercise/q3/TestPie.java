package com.nk2164.maps.exercise.q3;

public class TestPie {

	public static void main(String[] args) {
		Pie p1 = new PumpKinPie();
		Pie p2 = new ApplePie();
		makePie(p1);
		makePie(p2);
	}
	
	private static void makePie(Pie p) {
		p.makePie();
	}
}
