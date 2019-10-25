import java.text.*;
import java.util.*;

public class SimpleDateFormatDemo2 {
	public static void main(String args[]) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		System.out.println("dd-M-yyyy hh:mm			: " + formatter.format(date));
		formatter = new SimpleDateFormat("MM-dd-yy hh:mm:ss");
		System.out.println("MM-dd-yy hh:mm:ss			: " + formatter.format(date));
	}
}
