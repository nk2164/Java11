package com.nk2164.function;

public class Square implements Shape {
	private int length;
	private int bredth;
	
	public Square(int length,int bredth) {
		this.length = length;
		this.bredth = bredth;
	}
	public double ComputeArea() {
		return length * bredth;
	}

}
