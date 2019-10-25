import java.util.*;

public class CalendarDemo2 {
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Present calendar year	: " + cal.get(Calendar.YEAR));
		System.out.println("Present calendar day	: " + cal.get(Calendar.DATE));
	}
}
