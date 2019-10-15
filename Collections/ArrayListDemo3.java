import java.util.*;

public class ArrayListDemo3 {
	private static void showList(Iterator itr) {
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("One.");
		list.add("Two.");
		list.add("Three.");
		list.add("Four.");
		list.add("Five.");
		list.add("Six.");
		System.out.println("Displaying list as it is.");
		showList(list.iterator());
		list.remove(2);
		list.remove(3);
		System.out.println("Removed to elements..");
		showList(list.iterator());
		list.clear();
		System.out.println("Removed all elements.");
		showList(list.iterator());
	}
}
