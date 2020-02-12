package com.nk2164.basics;

import com.nk2164.example.DataHolder;

public class DataHolderTest {

	public static void main(String[] args) {
		DataHolder<String> ds = new DataHolder<>();
		ds.setData("Hello World!!");
		
		System.out.println(ds.getData());
	}
}
