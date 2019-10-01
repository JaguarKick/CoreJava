public class VarArgsDemo2 {
	private static void list(int count, String...names) {
		for(int i=0;i<count;i++) {
			System.out.println(names[i]);
		}
	}

	public static void main(String args[]) {
		list(3, "Sam","Mike","John");
	}
}
