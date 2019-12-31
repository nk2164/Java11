package com.nk2164.basics;
import java.util.Objects;

public class BookService_Objects {
	
	public static void main(String[] args) {
		
		new BookService_Objects().isBookReadyForPublication(null);
	}
	
	public boolean isBookReadyForPublication(Book book) {
		Objects.requireNonNull(book, "Book is null");
		return false;
	}

}
