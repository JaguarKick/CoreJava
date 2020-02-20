public class LastIndexOfDemo {
	public static void main(String args[]) {
		String text = "Earth is the third planet of our Solar System. This planet is also known as the blue planet.";
		System.out.println(text.lastIndexOf("planet"));
		System.out.println(text.lastIndexOf("the",20));
	}
}
