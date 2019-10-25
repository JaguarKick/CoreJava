import java.text.*;
import java.util.*;

public class DateFormatDemo {
	public static void main(String args[]) throws Exception {
		Date currentDate = new Date();
		System.out.println("Current date is 	: " + currentDate);
		System.out.println("Formated date	: " + DateFormat.getInstance().format(currentDate));
	}
}
