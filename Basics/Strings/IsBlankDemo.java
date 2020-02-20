public class IsBlankDemo {
	public static void main(String args[]) {
		String text = "";
		System.out.println((text.isBlank())?"YES":"NO");
		text = " ";
		System.out.println((text.isBlank())?"YES":"NO");
	}
}
