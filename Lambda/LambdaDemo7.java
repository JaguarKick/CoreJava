import java.util.*;

public class LambdaDemo7 {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Sam");
		list.add("James");
		list.add("Mike");
		list.add("Bruce");
		
		list.forEach((n)->System.out.println(n));
	}
}
