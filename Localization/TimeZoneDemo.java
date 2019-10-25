import java.util.*;

public class TimeZoneDemo {
	public static void main(String args[]) {
		String []id = TimeZone.getAvailableIDs();
		for(String s: id) {
			System.out.println(s);
		}
	}
}
