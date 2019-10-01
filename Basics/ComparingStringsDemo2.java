public class ComparingStringsDemo2 {
	public static void main(String args[]) {
		String n1 = new String("Sam");
		String n2 = new String("Sam");
		
		if(n1==n2) {
			System.out.println("Same.");
		} else {
			System.out.println("Not same.");
		}
		
		if(n1.equals(n2)) {
			System.out.println("Same.");
		} else {
			System.out.println("Not same.");
		}
	}
}
