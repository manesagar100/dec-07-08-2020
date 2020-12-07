import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierAndConsumerExample {

	public static void main(String[] args) {
		
		// Supplier supplies data of any type
		// get, exception handling 
		
		Supplier<Integer> randomGenerator = () -> (int)(Math.random() * 100);
		System.out.println(randomGenerator.get());

		Supplier<LocalDateTime> now = () -> LocalDateTime.now();
		System.out.println(now.get());
		
		
		// Consumer consumes the data you pass
		// forEach method takes in a Consumer as argument
		Consumer<String> print = data -> System.out.println(data);
		print.accept("Some data");
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach(num -> System.out.println(num));
		
		
		BiConsumer<Double, Double> areaOfRectangle = (len, bre) -> System.out.println("Area is " + (len * bre));
		areaOfRectangle.accept(12.34, 34.45);
		
	}

}
