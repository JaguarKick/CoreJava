public class StringInternDemo{
	public static void main(String args[]) {
		String s1 = new String("Hello World").intern();
		String s2 = new String("Hello World").intern();
		
		System.out.println((s1==s2)?"True":"False");
	}
}
/*
Results false if intern is not used.
*/
