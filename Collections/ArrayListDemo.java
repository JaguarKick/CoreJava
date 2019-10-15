import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sam");
		list.add("James");
		list.add("Henry");
		list.add("Amanda");
		list.add("Julia");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
