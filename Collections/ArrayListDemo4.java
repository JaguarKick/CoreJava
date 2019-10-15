import java.util.*;

public class ArrayListDemo4 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		list.add("Eight");
		System.out.println("List has total of " + list.size() + " elements.");
		for(String s:list) {
			System.out.println(s);
		}
	}
}
