import java.time.*;
import java.time.temporal.*;

public class MonthDayDemo2 {
	public static void main(String args[]) {
		MonthDay month = MonthDay.now();
		System.out.println(month.get(ChronoField.MONTH_OF_YEAR));
	}
}
