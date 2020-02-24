public class JoinDemo{
	public static void main(String args[]) {
		String []wordList = {"Bull","Pipes","Apple","Jam","Ink","Place"};
		String text = String.join(" ", wordList);
		System.out.println(text);
	}
}
