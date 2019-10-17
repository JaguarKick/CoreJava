import java.time.*;

public class LocalTimeDemo4 {
	public static void main(String args[]) {
		ZoneId zone = ZoneId.of("Canada/Eastern");
		LocalTime time = LocalTime.now(zone);
		System.out.println("Current time in Canada is : " + time);
	}
}
