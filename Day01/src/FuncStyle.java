import java.util.Arrays;
import java.util.List;

public class FuncStyle {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("Java", "Ruby", "Scala", "JavaScript", "Python");
		
		
		// Readability
		// where are the variables? Immutable style
		// parallel?
		// chaining of functions
		// Declarative or Functional style of programming
		// You write and say WHAT to do
		
		langs
			.stream()
			.parallel()
			.filter(lang -> lang.startsWith("J"))
			.forEach(System.out::println);
		
		final String message = langs
			.stream()
			.filter(lang -> "Groovy".equals(lang))
			.findAny()
			.orElse("Not found");
		
		System.out.println(message);
		
		
		
		// Sheer verbosity
		// Redesign and rewrite your code if you want to bring in parallelism
		// Imperative style of programming
		// Write code and say what to do and also how to do
		// variables scattered all over; leads to synchronization problems
		
		// print the languages that begin with letter J
		for (int i = 0; i < langs.size(); i++) {
			String language = langs.get(i);
			if(language.startsWith("J")) {
				System.out.println(language);
			}
		}
		
		// check if Python is available in the list
		
		boolean found = false;
		for (int i = 0; i < langs.size(); i++) {
			String language = langs.get(i);
			if ("Python".equals(language)) {
				found = true;
			}
		}
		if(found) {
			System.out.println("Python is present in the list");
		}
		else {
			System.out.println("Python is not present in the list");
		}
		
	}

}
