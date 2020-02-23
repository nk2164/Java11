package com.nk2164.basics;

public class SuperClass {

	public SuperClass() throws Exception {
		if (Math.random() > 0.5) {
			throw new Exception();
		}
	}
	
	public SuperClass(int x){
		
	}
}
