import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// Function takes in argument of any TYPE and returns data of ANY type
		// In stream API map() method accepts Function as an argument 
		
		Function<String, Integer> len = data -> data.length();
		System.out.println(len.apply("hello"));
		
		
		Function<Integer, Integer> inc = num -> num + 1;
		System.out.println(inc.apply(12));
		
		BiFunction<Integer, Integer, Boolean> max = (num1, num2) -> num1 > num2;
		System.out.println(max.apply(12, 10));
		
	}

}
