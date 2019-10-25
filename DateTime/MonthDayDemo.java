import java.time.*;

public class MonthDayDemo {
	public static void main(String args[]) {
		MonthDay month = MonthDay.now();
		LocalDate date = month.atYear(2000);
		System.out.println(date);
	}
}
