// Compile this with javac --enable-preview --release 14 FileName

public class NewConcepts {
	public static void main(String[] args) {
		var str = "var keyword in java";
		System.out.println(str);
		
		String multiline = """
				Hello there!
				How are you?	
		""";
		System.out.println(multiline);
		
		System.out.println();

		int number = 11;
		int rem = number % 2;
		
		// switch-case expressions
		String message = switch (rem) {
			case 0 -> "Even";
			case 1 -> "Odd";
			default -> "WTH";
		};
		
		// String type = "Even" if rem == 0 else "Odd";


/*		
		String message = null;
		int number = 11;
		int rem = number % 2;

		// switch-case statements	
		switch (rem) {
			case 0:
				message = "Even";
				break;
			case 1:
				message = "Odd";
				break;
		}
*/		
		System.out.println(message);
	}
}