package com.nk2164.ch1311;

public interface Movable {
	abstract void move1( int x); // OK, move1 is implicitly public 
	public abstract void move2(int x); // OK, move2 is explicitly public 
	//private void move3(int x); // NOT OK, abstract methods are always public 
	//protected void move4( int x); // NOT OK, abstract methods are always public 
    //private int PVT_VALUE = 10; // NOT OK, fields cannot be protected or private 
	int VALUE = 10; // OK, VALUE is implicitly public 
	
	private void pvtMethod(){ }; // OK, non-abstract methods can be private (but not protected)

	default String move() {
		return "I am moving !";
	}
	
	default String move3(int x) {
		return null;
	}
	
	static void sayHello() {
		System.out.println("Hello World!!");
	}
	
	default void move(int n) {
		while(n-- > 0) {
			moveInternal();
		}
	}
	private void moveInternal() {
		System.out.println("I am moving!!");
	}
	
	class Class1 {
		void method1() {
			System.out.println("printing from method1 in class1");
		}
	}
}
