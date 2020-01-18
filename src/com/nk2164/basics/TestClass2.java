package com.nk2164.basics;

public class TestClass2 {

	public static String field1 = "Hello World!";
	public String field2 = "How are you doing ?";

	public static void main(String[] args) {

		AccountParent[] sa = {new Account()};
		AccountParent[] oa = sa;
		oa[0] = new AccountParent();

	}
}
