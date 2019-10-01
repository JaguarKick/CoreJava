public class AndDemo {
	public static void main(String args[]) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		if(n1%2==0 && n2%2==0) {
			System.out.println("Both numbers are even.");
		} else {
			System.out.println("One of the numbers is not even.");
		}
	}
}
