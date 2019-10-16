import java.util.*;

public class HashMapDemo {
	public static void main(String args[]) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		System.out.println("Initial list of elements : " + hm);
			hm.put(1, "One");
			hm.put(2, "Two");
			hm.put(3, "Three");
			hm.put(4, "Four");
			System.out.println("After initializing four elements : " + hm);
			for(Map.Entry entry:hm.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
	}
}
