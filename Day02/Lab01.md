* You have a collection of items with their names and prices

```java


public class Item {
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
```

```java
	private List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15))
```


## Use method reference and implement the following.
* Print the names of the items
* Print the name of the items which cost more than  25$. Add a method isGt25() in Item class.
* Add a discount of 5% to all the items and print the total price. Add a method calculateDiscount() in Item class.



