import java.util.*;

public class CalendarDemo {
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		System.out.println("The current date is 	: " + cal.getTime());
		cal.add(Calendar.DATE,-15);
		System.out.println("5 days ago the time was	: " + cal.getTime());
		cal.add(Calendar.MONTH, 4);
		System.out.println("4 Months from now		: " + cal.getTime());
		cal.add(Calendar.YEAR, 2);
		System.out.println("2 years from now		: " + cal.getTime());
	}
}
