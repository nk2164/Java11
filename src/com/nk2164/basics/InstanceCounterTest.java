package com.nk2164.basics;

public class InstanceCounterTest {

	public static void main(String[] args){ 
		InstanceCounter ic = new InstanceCounter(); 
		
		ic.printCount();// accessing static method through a reference to an instance 
		new InstanceCounter();
		InstanceCounter.printCount(); // accessing static method through an implicit reference to an instance 

		System.out.println( "InstanceCounter.printCount() " + InstanceCounter.count); // accessing static members using the class name

	}

}