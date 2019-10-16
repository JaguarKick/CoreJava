import java.util.*;

public class LinkedHashSetDemo {
	public static void main(String args[]) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("MSI");
		lhs.add("Asus");
		lhs.add("Intel");
		lhs.add("Zotak");
		lhs.add("Corsair");
		lhs.add("Cooler Master");
		lhs.add("Seagate");
		System.out.println(lhs);
	}
}
