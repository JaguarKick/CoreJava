public class VarArgsDemo {
	private static void names(String...names) {
		for(String n:names) {
			System.out.println(n);
		}
	}

	public static void main(String args[]) {
		names("Sam","James","Mike","Amanda","William");
	}
}
