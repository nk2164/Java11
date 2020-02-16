package com.nk2164.function;

import java.util.function.Supplier;

public class TestClass2 {
	public static void main(String[] args) {

		double price = 100.00;
		Supplier<Item> iSupp = () -> new Item("item1", price);

		// price = 200; - When you change value of price, this is not effectively final
		// and hence cannot be used in the lambda expression.

		System.out.println(iSupp.get().price);
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
