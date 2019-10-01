public class ComparingStringsDemo {
	public static void main(String args[]) {
		String n1 = "Sam Paul";
		String n2 = "Sam Paul";
		String n3 = new String("Sam Paul");
		String n4 = n1;
		
		if(n1==n2) {
			System.out.println("Both are equal.");
		} else {
			System.out.println("Not equal.");
		}

		if(n1==n4) {
			System.out.println("Both are equal.");
		} else {
			System.out.println("Not equal.");
		}
		
		if(n1==n3) {
			System.out.println("Both are equal.");
		} else {
			System.out.println("Not equal.");
		}
	}
}
