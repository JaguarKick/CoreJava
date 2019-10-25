import java.time.*;

public class LocalDateDemo4 {
        public static void main(String args[]) {
                LocalDate date = LocalDate.now();
		if(date.isLeapYear()) {
			System.out.println("This year is a leap year.");
		} else {
			System.out.println("This year is not a leap year.");
		}
        }
}

