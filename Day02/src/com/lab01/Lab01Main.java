package com.lab01;

import java.util.Arrays;
import java.util.List;

public class Lab01Main {
	private static List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));
	
	public static void main(String[] args) {
		// Print the names of the items
		items
			.stream()
			.map(Item::getName)
			.forEach(System.out::println);
		
		System.out.println();
		// Print the name of the items which cost more than  25$. Add a method isGt25() in Item class.
		items
			.stream()
			//.filter(Item::isGt25)
			.filter(Lab01Main::isGt25)
			.map(Item::getName)
			.forEach(System.out::println);
		
		// Add a discount of 5% to all the items and print the total price. Add a method calculateDiscount() in Item class.
		final double discountedPrice = items
			.stream()
			.map(Item::calculateDiscount)
			.reduce(Lab01Main::computeSum)
			.get();
		System.out.println("Discounted price: " + discountedPrice);

	}
	
	static boolean isGt25(Item item) {
		return item.getPrice() > 25;
	}
	
	static double computeSum(double currentValue, double nextValue) {
		return currentValue + nextValue;
	}
}

class Item {
	private String name;
	private double price;

	
	public double calculateDiscount() {
		return price - (price * 0.05);
	}
	
	public boolean isGt25() {
		return price > 25;
	}
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
}