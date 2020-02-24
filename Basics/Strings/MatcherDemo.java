import java.util.regex.*;

public class MatcherDemo {
	private static final String RAW_DATA = "Earth is the third planet of our Solar System. This planet is also known as the blue planet";
	
	public static void main(String args[]) {
		Pattern pat = Pattern.compile("(.*)net(.*)");
		Matcher match = pat.matcher(RAW_DATA);
		System.out.println(match.matches());
	}
}
