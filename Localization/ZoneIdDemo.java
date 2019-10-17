import java.time.*;

public class ZoneIdDemo {
	public static void main(String args[]) {
		for(String s:ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
	}
}
