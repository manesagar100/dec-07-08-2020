import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		// Stream API is an abstraction to your collections
		// A stream object is an abstraction to a collection
		// It is used for read-only purposes
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		Stream<Integer> numbersStream = numbers.stream(); // an abstraction for a collection
		Iterator<Integer> numbersIterator = numbers.iterator(); // an abstraction for a collection
		
		// streams are processed sequentially by default
		// You cannot modify the underlying collection using stream
		
		numbersStream.forEach(it -> System.out.println(it));
		
		// streams cannot be reused
		// numbersStream.forEach(it -> System.out.println(it));
		
		numbersStream = numbers.stream();
		numbersStream.forEach(it -> System.out.println(it));
		
		Set<String> cities = new HashSet<String>();
		cities.add("Pune");
		cities.add("Chennai");
		
		Stream<String> citiesStream = cities.stream();
		
		// Specialized streams
		IntStream intStream = IntStream.range(1, 101);
		LongStream longStream = LongStream.of(10, 20, 40);
		
		// Streams support lazy evaluation
		IntStream evenStream = intStream.filter(it -> it % 2 == 0); // Not evaluated immediately
		// Called when you call close()
		evenStream.onClose(() -> System.out.println("****I am done***"));
		evenStream.onClose(() -> System.out.println("****I am done2***"));
		
		
		evenStream.forEach(it -> System.out.println(it)); // Evaluated only when a final condition is met
		
		evenStream.close(); // Not sure about the use-case
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
