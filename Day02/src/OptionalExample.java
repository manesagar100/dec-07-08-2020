import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {

	static Map<Integer, String> romanNumerals = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		romanNumerals.put(1, "I");
		romanNumerals.put(2, "II");
		romanNumerals.put(3, "III");
		romanNumerals.put(4, "IV");
		
//		System.out.println(getRomanNumberOf(1));
//		System.out.println(getRomanNumberOf(2));
//		System.out.println(getRomanNumberOf(3).length());
//		System.out.println(getRomanNumberOf(4).length());
//		String five = getRomanNumberOf(5);
//		if (five != null) {
//			System.out.println(five.length()); // five?.length in several other languages. ? is a safe-navigation operator 	
//		}
		
		Optional<String> one = getRomanNumber(1);
		if (one.isPresent()) {
			System.out.println(one.get());
		}
		
		Optional<String> five = getRomanNumber(5);
		// System.out.println(five.get());
		if (five.isPresent()) {
			System.out.println(five.get());
		}
		else {
			System.out.println("5 is not present");
		}
		
		
		String six = getRoman(6);
		System.out.println(six);
		
		String seven = getRomanValue(7);
		System.out.println(seven);
		
	}
	
	
	// Optional type is like a box
	// the box can have a value or can be empty
	// the methods will always return a box and not NULL

	static String getRomanValue(int num) {
		String result = Optional
				.ofNullable(romanNumerals.get(num))
				.orElseThrow(() -> new RuntimeException(num + " is not found"));
		return result;
	}
	
	static String getRoman(int num) {
		String result = Optional
				.ofNullable(romanNumerals.get(num))
				.orElse(num + " is not available");
		return result;
	}
	
	
	static Optional<String> getRomanNumber(int num) {
		Optional<String> result = Optional.ofNullable(romanNumerals.get(num));
		return result;
	}
	

	// A bad practice to return null from methods
	static String getRomanNumberOf(int num) {
		String retValue = null;
		if (romanNumerals.containsKey(num)) {
			retValue = romanNumerals.get(num);
		}
		return retValue;
	}

}
