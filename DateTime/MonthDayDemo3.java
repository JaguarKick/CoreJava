import java.time.*;
import java.time.temporal.*;

public class MonthDayDemo3 {
	public static void main(String args[]) {
		MonthDay month = MonthDay.now();
		ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);
		ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);
		System.out.println("Value Range 1	: " + r1);
		System.out.println("Value Range 2	: " + r2);
	}
}
