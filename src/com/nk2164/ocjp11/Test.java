package com.nk2164.ocjp11;

import java.util.HashMap;
import java.util.Map;

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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + itemNumber;
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			if (itemNumber != other.itemNumber)
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}
		
		
	}

	public static void main(String[] args) {

		Map<Book,Integer> books = new HashMap<Book,Integer>();
		books.put(new Book(1, "The Lord of the rings"),1);
		books.put(new Book(1, "Le Petit"),2);
		
		System.out.println(books.get("Le Petit"));
	}
}