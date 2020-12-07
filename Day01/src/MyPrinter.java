import java.time.LocalDate;
import java.time.LocalTime;

public interface MyPrinter {
	void print(String data);
	
	default String now() {
		return LocalTime.now().toString();
	}
	
	default String now2() {
		return LocalTime.now().toString();
	}
	
	private static String todayDate() {
		return LocalDate.now().toString();
	}
	
	public static String today() {
		return "Today is " + todayDate();
	}
}
