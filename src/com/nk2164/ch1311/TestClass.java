package com.nk2164.ch1311;

public class TestClass {
	
	public static void main(String[] args) {
		//Here we are creating an anonymous inner class that implements
		//the dummy interface.
		Dummy dmy = new Dummy() {

			@Override
			public void doSomething() {
				
			}
			
		};
	}
}
