import java.time.*;

public class LocalDateDemo2 {
	public static void main(String args[]) {
		LocalDate date = LocalDate.now();
		System.out.println("Yesterday, the date was		: " + date.minusDays(1));
		System.out.println("Today is 			: " + date);
		System.out.println("Tomorrow is			: " + date.plusDays(1));
	}
}			
