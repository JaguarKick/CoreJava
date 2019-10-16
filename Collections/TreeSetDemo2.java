import java.util.*;

public class TreeSetDemo2 {
	public static void main(String args[]) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Scorpion");
		ts.add("Sub-Zero");
		ts.add("Reptile");
		ts.add("Smoke");
		ts.add("Noob Saibot");
		ts.add("Rain");
		ts.add("Mileena");
		ts.add("Kitana");
		ts.add("Jade");
		ts.add("Cindel");
		Iterator itr = ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
