import java.time.*;

public class LocalTimeDemo3 {
	public static void main(String args[]) {
		LocalTime time = LocalTime.now();
		System.out.println("One hour ago, the time was : " + time.minusHours(1));
		System.out.println("Four hours from now, the time will be : " + time.plusHours(4));
	}
}
