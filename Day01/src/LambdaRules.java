import java.time.LocalDateTime;

public class LambdaRules {

	
	public static void main(String[] args) {
		// Only interfaces with just ONE abstract method can be used as lambda expressions
		// The interfaces with just ONE abstract method are called Functional interfaces
		Printer printer1 = data -> System.out.println(data);	// Type is inferred
		printer1.print("Hello");
		
		Printer printer2 = (String data) -> System.out.println(data);	// Specify the type
		printer2.print("Hello world");
		
		Printer printer3 = data -> {
			System.out.println("*****");
			System.out.println("This is lambda with a body");
			System.out.println(data);
			System.out.println("*****");
			for(int i=0; i<5; i++) {
				System.out.println("WTH is going on?");
			}
		};
		printer3.print("monday blues");
		
		MyCalendar cldr1 = () -> LocalDateTime.now().toString(); // return keyword is not required
		System.out.println(cldr1.now());
		
		MyCalendar cldr2 = () -> {	// if lambda has a body, return keyword is required
			return LocalDateTime.now().toString();
		};
		System.out.println(cldr2.now());
		
		RandomGenerator gen1 = () -> (int)(Math.random() * 100);
		RandomGenerator gen2 = () -> {
			return (int)(Math.random() * 100);
		};
		
		Printer printer4 = d -> System.out.println(d);
		printer4.print("any name");
		
		Operation op = (a, b) -> a + b;
		System.out.println(op.add(12, 12));
		
		Operation op2 = (int num1, int num2) -> num1 + num2;
		
	}

}


interface Operation {
	int add(int a, int b);
	//int subtract(int a, int b);
}

interface RandomGenerator {
	int randomNo();
}

@FunctionalInterface
interface MyCalendar {
	String now();
}


interface Printer {
	void print(String data);
	//void printSomething();
}