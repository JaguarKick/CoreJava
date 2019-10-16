import java.util.*;

public class ArrayDequeDemo {
	public static void main(String args[]) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("One"); // add and returns true upon success
		deque.offer("Six"); // justs adds an element.
		deque.add("Two");
		deque.add("Three");
		deque.add("Four");
		deque.offer("Five");
		System.out.println(deque);
		System.out.println(deque.poll()); // removes and returns null if empty
		System.out.println(deque.remove()); // retrieve and remove
		System.out.println(deque.peek()); // retrieves an item from queue.
	}
}
		
