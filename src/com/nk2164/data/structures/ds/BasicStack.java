package com.nk2164.data.structures.ds;

public class BasicStack <E> {

	private E [] data;
	
	public BasicStack() {
		data = (E[]) new Object[1000];
	}
	
	public void push(String E) {
		//Placeholder
	}
	
	public int size() {
		return data.length;
	}
	
	public E pop() {
		return data[0];
	}
	
	public boolean contains(E data) {
		return true;
	}
	
	public E access(E data) {
		return null;
	}
	
}
