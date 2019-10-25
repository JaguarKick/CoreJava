import java.time.*;
import java.time.temporal.*;

public class ChronoUnitDemo {
	public static void main(String args[]) {
		ZoneId zone1 = ZoneId.of("Asia/Tokyo");
		ZoneId zone2 = ZoneId.of("Canada/Eastern");
		ZoneId zone3 = ZoneId.of("Asia/Kolkata");
		
		LocalTime japan = LocalTime.now(zone1);
		LocalTime canada = LocalTime.now(zone2);
		LocalTime india = LocalTime.now(zone3);

		System.out.println("There's a difference of " + ChronoUnit.HOURS.between(japan,india) + " between Japan and India.");
		System.out.println("There's a difference of " + ChronoUnit.HOURS.between(japan,canada) + " between Japan and Canada");
		System.out.println("There's a difference of " + ChronoUnit.HOURS.between(india,canada) + " between India and Canada");
	}
}
