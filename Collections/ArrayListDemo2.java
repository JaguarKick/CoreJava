import java.util.*;

public class ArrayListDemo2 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Game of Thrones");
		list.add("Stranger Things.");
		list.add("Breaking Bad.");
		list.add("Spartacus.");
		list.add(2,"Prison Break");
		list.add(4,"Bodyguard.");
		list.add("Sherlock Homes");
		list.add("Vikings.");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
