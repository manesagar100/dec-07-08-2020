import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		// Making a stream parallel, creates threads based on the number of cores the machine has
		// splits the collection into number of parts and run each part in a separate thread
		// aggregates the results periodically and presents them
		
		IntStream numbersStream = IntStream.range(1, 101);
		
//		numbersStream
//			.parallel()
//			.filter(e -> {
//				sleep(500);
//				System.out.println("****filter " + e + " " + Thread.currentThread().getName());
//				return e % 2 == 0;
//			})
//			.forEach(System.out::println);
		
		
		final int result = numbersStream
			.parallel()
			.filter(e -> {
				sleep(500);
				System.out.println("****filter " + e + " " + Thread.currentThread().getName());
				return e % 2 == 0;
			})
			.findAny()
			.getAsInt();
		System.out.println(result);
	}

	static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		}
		catch(Exception ex) {
			
		}
	}
}

