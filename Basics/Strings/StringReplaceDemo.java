public class StringReplaceDemo {
	public static void main(String args[]) {
		String someText = "Once upon a time there was a Ninja. This Ninja was very kind. One day he just disappeared and no one gave a shit !";
		String replacement1 = someText.replace("Ninja","samurai");
		System.out.println("Original String : " + someText);
		System.out.println("Modified String : " + replacement1);
	}
}
