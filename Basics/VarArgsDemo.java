public class VarArgsDemo{
	private static void displayNames(String...name){
		for(String s:name){
			System.out.println(s);
		}
	}

	public static void main(String args[]){
		displayNames("Sam","Adam","SJ","James");
	}
}
