import java.util.*;

public class LinkedListDemo2 {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Sam");
		list.add("Michael");
		list.addFirst("Johnson");
		list.addLast("Amanda");
	
		System.out.println("Firt Element in the list is : " + list.peek());
		System.out.println("Last element in the list is : " + list.poll());
	}
}
