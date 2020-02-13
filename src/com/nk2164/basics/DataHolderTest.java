package com.nk2164.basics;

import com.nk2164.example.DataHolder;

public class DataHolderTest {

	public static void main(String[] args) {
		DataHolder<String> ds = new DataHolder<>();
		DataHolder<Integer> di = new DataHolder<>();
		
		di.setData(2000);
		ds.setData("Hello World!!");
		
		System.out.println(ds.getData());
		System.out.println(di.getData());
	}
	
	public void processData(DataHolder<String> str) {
		//do something
	}
	
}