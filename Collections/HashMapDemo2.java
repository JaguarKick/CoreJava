import java.util.*;

public class HashMapDemo2 {
	public static void main(String args[]) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		
		System.out.println("Items so far : " + hm);

		hm.putIfAbsent(4, "Four");
		hm.putIfAbsent(5, "Five");
		hm.putIfAbsent(6, "Six");
		
		System.out.println("Now it's : " + hm);

		hm.remove(3);
		hm.remove(1);
		System.out.println("And now it's : " + hm);

		hm.replace(3, "three");
		hm.replace(2, "Ni");
		System.out.println("Finally it's : " + hm);
	}
}
