public class Lambdas1 {

	public static void main(String[] args) {
		// Concrete class that implements an interface
		Greetings greetingsOld = new GreetingsImpl();
		greetingsOld.hello("Sam");
		
		// Anonymous inner class that implements an interface
		// Compiler generates a $1.class file
		Greetings greetings = new Greetings() {
			public void hello(String name) {
				System.out.println("Hey " + name);
			}
		};
		greetings.hello("Sam");
		
		// Lambda expressions are implementations of interfaces
		// JVM generates new class that implements the interface
		Greetings greetingsModern = name -> System.out.println("Wassup " + name);
		greetingsModern.hello("Sam");
		System.out.println(greetingsModern.getClass().getName());
	}
}



interface Greetings {
	void hello(String name);
}

class GreetingsImpl implements Greetings {
	public void hello(String name) {
		System.out.println("Hello " + name);
	}
}