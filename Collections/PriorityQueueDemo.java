import java.util.*;

class PriorityQueueDemo {
	public static void main(String args[]) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Anna");
		pq.add("Ogre");
		pq.add("Nina");
		pq.add("Paul");
		pq.add("Lei");
		pq.add("Law");
		pq.add("Sam");
		pq.add("Tiger");
		pq.add("Gon");
		pq.add("Jin");
		System.out.println(pq);
		System.out.println("First in queue : " + pq.element());
		System.out.println("First in queue : " + pq.peek()); // returns null when empty
		pq.remove();
		pq.poll(); // returns null when list empty.
		System.out.println(pq);
	}
}
