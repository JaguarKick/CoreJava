import java.text.*;
import java.util.*;

public class SimpleDateFormatDemo {
	public static void main(String args[]) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println("DD/MM/YYYY			: " + formatter.format(date));
		formatter = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println("MM/DD/YYYY			: " + formatter.format(date));
		formatter = new SimpleDateFormat("YYYY/MM/dd");
		System.out.println("YYYY/MM/DD			: " + formatter.format(date));
	}
}
