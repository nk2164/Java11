package com.nk2164.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestClass2 {
	public static void main(String[] args) {

		double price = 100.00;
		Supplier<Item> iSupp = () -> new Item("item1", price);

		// price = 200; - When you change value of price, this is not effectively final
		// and hence cannot be used in the lambda expression.

		System.out.println(iSupp.get().price);

		printArea(new Circle(10));
		printArea(new Square(10, 20));

		Consumer<Shape> s = q -> System.out.println(q.ComputeArea());

		s.accept(new Circle(10));
		s.accept(new Square(10, 20));

		List<Image> imageList = new ArrayList<Image>(List.of(new Image(10, 20), new Image(30, 40), new Image(110,200)));
		System.out.println(imageList);

		System.out.println(filterImages(imageList, p -> p.getHeight() >= 100 && p.getWidth() >= 100));

	}

	public static List<Image> filterImages(List<Image> list, Predicate<Image> p) {
		List<Image> result = new ArrayList<>();

		for (Image img : list) {
			if (p.test(img)) {
				result.add(img);
			}
		}

		return result;
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