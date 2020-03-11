package com.d84u.ocjp11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String itemName;
		Double itemPrice;
		String itemOnSale;
		String moreItems;

		List<Item> items = new ArrayList<>();

		try (Scanner scan = new Scanner(System.in)) {
			do {
				// Name of the item
				System.out.println("Item Name ?");
				itemName = scan.next();

				// Price of the item
				System.out.println("Item Price ?");
				itemPrice = scan.nextDouble();

				// Whether item is on sale
				System.out.println("On sale?(Yes/No)");
				itemOnSale = scan.next();

				System.out.println("Have more items ? (Yes/No)");
				moreItems = scan.next();

				items.add(new Item(itemName, itemPrice, itemOnSale));

			} while (moreItems.equalsIgnoreCase("yes"));
		} finally {
			printBill(items);
		}

	}

	private static void printBill(List<Item> items) {
		double total = 0.00;

		System.out.println("**************  Grocery Bill  ******************");

		System.out.println("*** ITEM NAME **** ITEM PRICE **** ON SALE ? ****");

		for (Item item : items) {
			System.out.printf("    %s             %.2f           %s           \n", item.itemName, item.price,
					item.itemOnSale);
			total += item.price;
		}

		System.out.println("************************************************");
		System.out.println("Total :" + total);
	}
}

class Item {

	String itemName;
	double price;
	String itemOnSale;

	public Item(String itemName, double price, String itemOnSale) {
		this.itemName = itemName;
		this.price = price;
		this.itemOnSale = itemOnSale;
	}

}