public class SplitDemo {
	public static void main(String args[]) {
		String text = "Earth is the third planet of our Solar System";
		for(String s:text.split(" "))
			System.out.println(s);
	}
}
