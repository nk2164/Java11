package com.nk2164.ch1311;

public interface Movable {
	void move1( int x); // OK, move1 is implicitly public 
	public void move2(int x); // OK, move2 is explicitly public 
	//private void move3(int x); // NOT OK, abstract methods are always public 
	//protected void move4( int x); // NOT OK, abstract methods are always public 
    //private int PVT_VALUE = 10; // NOT OK, fields cannot be protected or private 
	int VALUE = 10; // OK, VALUE is implicitly public 
	
	private void pvtMethod(){ }; // OK, non-abstract methods can be private (but not protected)

}
