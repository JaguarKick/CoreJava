public class MethodOverloadingDemo {
	private static void info() {
		System.out.println("This is an info with no parameter.");
	}

	private static void info(int n) {
		System.out.println("This is an info with integer parameter.");
	}

	public static void main(String args[]) {
		info();
		info(2);
	}
}
