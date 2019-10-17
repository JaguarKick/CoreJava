import java.time.*;
import java.time.format.*;

public class DateFormatterDemo {
	public static void main(String args[]) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before formatting the date : " + now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		System.out.println("After formatting : " + now.format(format));
	}
}
