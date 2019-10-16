import java.util.*;

public class HashSetDemo {
	public static void main(String args[]) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Apple");
		hs.add("Mango");
		hs.add("Orange");
		hs.add("Grapes");
		hs.add("Pineapple");
		hs.add("Banana");
		hs.add("Avocado");
		hs.add("Apple"); // Duplicates will be ignored.
		hs.add("Guava");
		hs.add("Peach");
		hs.add("Orange");// Duplicates will be ignored.
		hs.add("Plum");
		hs.add("Jack fruit");
		System.out.println(hs);
	}
}
