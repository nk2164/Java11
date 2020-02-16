package com.nk2164.function;

public class Circle implements Shape{

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double ComputeArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
