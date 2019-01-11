public class StringConcatDemo{
	public static void main(String args[]){
		String text1 = "Hello World";
		String text2 = "I've been waiting for the chance to see your face.";
		String text3 = "";
		text3 = text3.concat(text1);
		text3 = text3.concat(" ");
		text3 = text3.concat(text2);
		System.out.println(text3);
	}
}
