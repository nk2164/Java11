package com.d84u.ocjp11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static class Book {
		int itemNumber;
		String title;

		public Book(int itemNumber, String title) {
			this.itemNumber = itemNumber;
			this.title = title;
		}

		@Override
		public String toString() {
			return this.title;
		}
	}

	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "The Lord of the rings"));
		books.add(new Book(1, "Le Petit"));
		
		System.out.println(books.toString());

		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.title.compareTo(o2.title);
			}

		});
		
		System.out.println(books.toString());
	}
}