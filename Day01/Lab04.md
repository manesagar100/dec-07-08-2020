* Please refer to __FunctStyle.java__ in __Day01__
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


## To Do in Declarative and Imperative style
* Print the name of the items which cost more than  25$
* Print the total price of the items that cost more than 20$
* Print the total price of the items that cost more than 25$, add 10% discount 



