import java.util.*;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Michael");
		list.add("Johnson");
		list.add("Yolanda");
		list.add("Orlando");
		list.add("Emily");
		for(String s:list) {
			System.out.println(s);
		}
	}
}
