import java.text.*;
import java.util.*;

public class DateFormatDemo2 {
	public static void main(String args[]) {
		Date currentDate = new Date();
		System.out.println("Current Date			: " + currentDate);
		System.out.println("Formatted Date/Time			: " + DateFormat.getInstance().format(currentDate));
		System.out.println("Formatted Date			: " + DateFormat.getDateInstance().format(currentDate));
		System.out.println("Formatted Time			: " + DateFormat.getTimeInstance().format(currentDate));
		System.out.println("Short Time format			: " + DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate));
		System.out.println("Medium Time format			: " + DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate));
		System.out.println("Long Time format			: " + DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate));
	}
}
