import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		// Predicate is a functional interface that accepts data of any TYPE and returns BOOLEAN
		// In the stream API the filter method accepts a Predicate as argument
		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println(isEven.test(12));
		System.out.println(isEven.test(121));
		
		Predicate<String> isLengthGt10 = data -> data.length() > 10;
		System.out.println(isLengthGt10.test("hello"));
		
		Predicate<Integer> isOdd = num -> num % 2 != 0;
		System.out.println(isOdd.test(121));
		
		System.out.println(isEven.negate().test(121));
	}
}
