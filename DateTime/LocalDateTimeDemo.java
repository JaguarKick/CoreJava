import java.time.*;

public class LocalDateTimeDemo {
	public static void main(String arg[]){
		LocalDate date = LocalDate.now();
		LocalDateTime time = date.atTime(11,23,23);
		System.out.println(time);
	}
}
