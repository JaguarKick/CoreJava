import java.util.*;

public class TimeZoneDemo2 {
	public static void main(String args[]) {
		String []zones = TimeZone.getAvailableIDs();
		TimeZone tz = null;
		for(String s:zones) {
			tz = TimeZone.getTimeZone(s);
			System.out.println(tz.getID() + "	: " + tz.getDisplayName());
		}
	}
}
