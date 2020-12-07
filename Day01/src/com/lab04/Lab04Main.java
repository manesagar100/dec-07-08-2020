package com.lab04;

import java.util.Arrays;
import java.util.List;

public class Lab04Main {

	private static List<Item> items = Arrays.asList(
			new Item("Nike", 20.45), 
			new Item("Adidas", 31.45), 
			new Item("Reebok", 29.25), 
			new Item("Puma", 25.15), 
			new Item("Fila", 15.15));
	
	public static void main(String[] args) {
		items
			.stream()
			.filter(it -> it.getPrice() > 20)	//Predicate<Item>
			.forEach(it -> System.out.println(it.getName())); //Consumer
		
		final double total = items
			.stream()
			.filter(it -> it.getPrice() > 20) // Predicate<Item>
			.mapToDouble(it -> it.getPrice())	// Function<Item, Double>
			.sum();
		System.out.println("Total: " + total);
		
		
		// Print the total price of the items that cost more than 25$, add 10% discount 
		final double discountedPrice = items
				.stream()
				.filter(it -> it.getPrice() > 25)
				.mapToDouble(it -> it.getPrice() - (it.getPrice() * 0.01)) // Function<Item, Double>
				.sum();
		System.out.println("Discounted price: " + discountedPrice);
		
		
		// Imperative style
		double price = 0;
		for (Item item : items) {
			if(item.getPrice() > 25) {
				double discount = item.getPrice() * 0.01;
				price += (item.getPrice() - discount);
			}
		}
		System.out.println("Discounted price: " + price);
		
	}

}

class Item {
	private String name;
	private double price;

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
