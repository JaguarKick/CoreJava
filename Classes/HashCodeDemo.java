public class HashCodeDemo {
	public static void main(String args[]) {
		String name = "Sam Paul";
		System.out.println(name.hashCode());
		name = "Paul Sam";
		System.out.println(name.hashCode());
		name = "Sam Paul";
		System.out.println(name.hashCode());
	}
}
