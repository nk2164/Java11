package com.nk2164.ch1311;

public interface ReadWritable extends Readable, Writable {

	int x = Readable.SIZE + Writable.SIZE; //ReadWritable gets 2 copies of variable 
	                                       //SIZE from super interfaces.

	@Override
	default void defaultMethod() {
		System.out.println("In read writable!!");
	}

	
}