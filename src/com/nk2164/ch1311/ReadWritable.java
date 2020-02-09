package com.nk2164.ch1311;

public interface ReadWritable extends Readable, Writable {

	@Override
	default void defaultMethod() {
		System.out.println("In read writable!!");
	}

	
}