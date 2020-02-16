package com.nk2164.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestClass2 {
	public static void main(String[] args) {

		double price = 100.00;
		Supplier<Item> iSupp = () -> new Item("item1", price);

		// price = 200; - When you change value of price, this is not effectively final
		// and hence cannot be used in the lambda expression.

		System.out.println(iSupp.get().price);
		
		printArea(new Circle(10));
		printArea(new Square(10,20));
		
		Consumer<Shape> s = q -> System.out.println(q.ComputeArea());
		
		s.accept(new Circle(10));
		s.accept(new Square(10,20));
		
	}
	
	public static void printArea(Shape s) {
		System.out.println(s.ComputeArea());
	}
	
}

class Item {
	String name;
	Double price;

	public Item(String name, Double price) {
		this.name = name;
		this.price = price;
	}

}