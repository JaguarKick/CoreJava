public class IfDemo {
	public static void main(String args[]) {
		int age = Integer.parseInt(args[0]);
		if(age < 18) {
			System.out.println("You're not allowed to vote.");
		} else {
			System.out.println("You're allowed to vote.");
		}
	}
}
