import java.util.*;

public class TreeSetDemo4 {
	public static void main(String args[]) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(4);
		ts.add(9);
		ts.add(16);
		ts.add(25);
		ts.add(36);
		ts.add(49);
		ts.add(64);
		ts.add(81);
		ts.add(100);

		System.out.println("As is 		: " + ts);
		System.out.println("Reversed	: " + ts.descendingSet());
		System.out.println("HeadSet		: " + ts.headSet(16,false));
		System.out.println("SubSet		: " + ts.subSet(9,true,64,false));
		System.out.println("TailSet		: " + ts.tailSet(36,false));
	}
}
