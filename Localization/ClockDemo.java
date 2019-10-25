import java.time.*;

public class ClockDemo {
	public static void main(String args[]) {
		Clock cl = Clock.systemDefaultZone();
		System.out.println(cl.getZone());
	}
}
