public class MultiIfDemo {
	public static void main(String args[]) {
		int a=45;
		int b=56;
		int c=23;
		if(a > b) {
			if(a > c) {
				System.out.println(a + " is the greatest.");
			} else {
				System.out.println(c + " is the greatest.");
			}
		} else {
			if(b > c) {
				System.out.println(b + " is the greatest.");
			} else {
				System.out.println(c + " is the greatest.");
			}
		}
	}
}
