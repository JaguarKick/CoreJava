import java.time.*;
import java.time.temporal.*;

public class ChronoFieldDemo {
	public static void main(String args[]) {
		LocalDateTime lc = LocalDateTime.now();
		System.out.println("DAY OF WEEK 		: " + lc.get(ChronoField.DAY_OF_WEEK));
		System.out.println("DAY OF YEAR		: " + lc.get(ChronoField.DAY_OF_YEAR));
		System.out.println("DAY OF MONTH		: " + lc.get(ChronoField.DAY_OF_MONTH));
	}
}
