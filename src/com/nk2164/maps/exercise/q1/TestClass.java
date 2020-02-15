package com.nk2164.maps.exercise.q1;

public class TestClass {
	public static void main(String[] args) {
		Document d = new PdfDocument();
		System.out.println(d.getType()); // should print "pdf"
	}
}