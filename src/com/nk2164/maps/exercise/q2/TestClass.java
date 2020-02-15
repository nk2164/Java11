package com.nk2164.maps.exercise.q2;

public class TestClass {

	public static void main(String[] args) {
		TV t = new TV();
		Radio r = new Radio();
		reset(t);
		reset(r);
		System.out.println(r.getFrequency());
		System.out.println(t.getChannel());
	}

	private static void reset(Equipment e) {
		e.reset(e);
	}
}