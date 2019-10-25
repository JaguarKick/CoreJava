import java.time.*;

public class LocalDateDemo3 {
        public static void main(String args[]) {
                LocalDate date = LocalDate.now();
                System.out.println("Last month, the date was    : " + date.minusMonths(1));
                System.out.println("Today is                    : " + date);
                System.out.println("Next month the date will be : " + date.plusMonths(1));
        }
}

