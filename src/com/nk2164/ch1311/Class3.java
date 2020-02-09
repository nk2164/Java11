package com.nk2164.ch1311;

public class Class3 {

	public static void main(String[] args) {
		Movable m1 = new Class2();
		Movable.sayHello();
		m1.move1(2);
		m1.move(10);
		//As the below code shows , you can declare class , interface or
		//enum declared inside an interface
		Movable.Class1 c1 = new Movable.Class1();
		c1.method1();
	}

}
