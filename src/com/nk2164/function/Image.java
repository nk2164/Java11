package com.nk2164.function;

public class Image {

	private int width;
	private int height;

	public Image(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "[ Image width = " + width + " height = " + height + " ]";
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
}