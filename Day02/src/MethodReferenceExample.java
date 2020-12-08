import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Predicate<Integer> even = num -> num % 2 == 0;
		System.out.println(even.test(12));
		
		/*
		Predicate<List<Integer>> isListEven = lst -> {
			boolean isEven = false;
			final List<Boolean> boolList = new ArrayList<Boolean>();
			lst.forEach(it -> boolList.add(it % 2 == 0));
			isEven = boolList
				.stream()
				.reduce((currValue, nextValue) -> currValue && nextValue)
				.get();
			return isEven;
		};
		*/
		
		Predicate<List<Integer>> isListEven = MethodReferenceExample::check;
		
		List<Integer> numbers = Arrays.asList(12, 2, 32, 42, 52);
		System.out.println(isListEven.test(numbers));
		
		// Function<Integer, Integer> inc = MethodReferenceExample::increment;
		
		MyMath math = new MyMath();
		Function<Integer, Integer> inc = math::increment;
		System.out.println(inc.apply(10));
		
		Function<String, Integer> len = String::length;
		System.out.println(len.apply("hello"));
		
		Function<String, String> toCaps = String::toUpperCase;
		System.out.println(toCaps.apply("pune"));
		
		numbers.forEach(it -> System.out.println(it));
		numbers.forEach(System.out::println);
		numbers.forEach(math::printNumber);
		
	}
	
	static int increment(int i) {
		return i + 1;
	}
	
	static boolean check(List<Integer> lst) {
		boolean isEven = false;
		final List<Boolean> boolList = new ArrayList<Boolean>();
		lst.forEach(it -> boolList.add(it % 2 == 0));
		isEven = boolList
			.stream()
			.reduce((currValue, nextValue) -> currValue && nextValue)
			.get();
		return isEven;
	}

}


class MyMath {
	public int increment(int i) {
		return i + 1;
	}
	public void printNumber(int num) {
		System.out.println(num);
	}
}

