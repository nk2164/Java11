package com.nk2164.bookcatalog;
public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();

		bc.findBookList(s -> {
			return s.getTitle().toLowerCase().contains("men") ? true : false;
		}).forEach(System.out::println);

		System.out.println();

		bc.findBookMap(s -> {
			return s.getTitle().toLowerCase().contains("men") ? true : false;
		}).forEach((i, j) -> {
			System.out.println("Book ID =" + i + " Title= " + j);
		});
		
		System.out.println();
		
		System.out.println(bc.howManyMatch(s -> {
			return s.getTitle().toLowerCase().contains("men") ? true : false;
		}));
	}
}
