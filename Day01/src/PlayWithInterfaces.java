
public class PlayWithInterfaces {

	public static void main(String[] args) {
		MyPrinter myPrinter1 = data -> System.out.println(data);
		myPrinter1.print("Hello");
		System.out.println(myPrinter1.now());
		System.out.println(MyPrinter.today());
	}

}
