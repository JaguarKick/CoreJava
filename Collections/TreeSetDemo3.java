import java.util.*;

public class TreeSetDemo3 {
	public static void main(String args[]) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(23);
		ts.add(54);
		ts.add(76);
		ts.add(12);
		ts.add(53);
		ts.add(63);
		ts.add(91);
		System.out.println("Highest value : " + ts.pollFirst());
		System.out.println("Lower value   : " + ts.pollLast());
	}
}
