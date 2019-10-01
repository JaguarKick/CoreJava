public class MethodOverloadingDemo2 {
	private static void info() {
		System.out.println("This is a method with no parameter.");
	}

	private static void info(int n) {
		System.out.println("This is a method with integer parameter.");
	}

	private static void info(String s) {
		System.out.println("This is a method with String parameter.");
	}


	public static void main(String args[]) {
		info();
		info(4);
		info("sam");
	}
}
