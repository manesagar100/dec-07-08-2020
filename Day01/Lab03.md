* Implement the formula __a^2 + b^2 + 2ab__
* You have __a=10 and b=12__

* Use the following code as starting point

```java
public class Lab03 {

	public static void main(String[] args) {
		
		//YOUR CODE GOES HERE
		
		
		//DO NOT MODIFY THE FOLLOWING LINES			
		final int result = aSquare
			.andThen(bSquare)
			.andThen(twoAB)
			.apply(new Params(10, 12, 0))
			.result;
		System.out.println(result);
	}

}

//YOU CAN USE THIS CLASS
class Data {
	public final int a, b, result;
	public Data(int a, int b, int result) {
		this.a = a;
		this.b = b;
		this.result = result;
	}
}
```
