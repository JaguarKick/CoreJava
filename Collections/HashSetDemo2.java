import java.util.*;

public class HashSetDemo2 {
	public static void main(String args[]) {
		HashSet<String> hs = new HashSet<String>(5); // Initializing capacity with 5 items.
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add("Six");
		hs.add("Seven");
		hs.remove("One");
		hs.remove("Four");
		System.out.println(hs);
	}
}

