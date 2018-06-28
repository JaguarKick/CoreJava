public class ComparingStrings{
	public static void main(String args[]){
		String str1 = new String("My name is Sam.");
		String str2 = new String("My name is Sam.");

		if(str1==str2){
			System.out.println("Both strings are same.");
		} else {
			System.out.println("Both are different.");
		}

		if(str1.equals(str2)){
			System.out.println("Both strings are identical.");
		} else {
			System.out.println("They are unidentical.");
		}
	}
}
