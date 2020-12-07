import java.util.Arrays;
import java.util.List;

public class WorkingOfStream {

	public static void main(String[] args) {
		// Streams take one item from a collection and passes it through the entire functions in the chain
		// If a condition is successful, it proceeds to the next item in the chain; else it picks up the next element and starts
		
		List<String> cities = Arrays.asList("Pune", "Chennai", "Panjim", "Bangalore", "Mumbai");
		
		// Print the cities that begin with P
		String city = cities
			.stream()
			.filter(it -> {
				System.out.println("****filter1 called for " + it);
				return it.length() > 4; 
			})
			.filter(it -> {
				System.out.println("----filter2 called for " + it);
				return it.startsWith("Z"); 
			})
			.map(it -> it.toUpperCase())
			.map(it -> it.substring(it.length() - 1))
			.findFirst()
			.orElse(null);
			//.get();
		System.out.println(city);
			//.forEach(it -> System.out.println(it));
		
		// map is used for transformation; It transforms every item in a collection from one format to another format
		// map always returns a collection
	}

}
