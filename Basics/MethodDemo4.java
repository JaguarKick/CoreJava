public class MethodDemo4 {
	private static void info(String name, int rollNo) {
		System.out.println("Hello " + name);
		info2(rollNo);
	}
	
	private static void info2(int rollNo) {
		System.out.println("Your roll no is " + rollNo);
	}

	public static void main(String args[]) {
		info("Sam",22);
	}
}
