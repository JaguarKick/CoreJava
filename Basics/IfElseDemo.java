public class IfElseDemo{
	public static void main(String args[]){
		int a = 23;
		int b = 12;
		int c = 26;
		if(a > b){
			if(a > c)
				System.out.println(a + " is the greatest.");
			else
				System.out.println(c + " is the greatest.");
		} else {
			if(b > c)
				System.out.println(b + " is the greatest.");
			else
				System.out.println(c + " is the greatest.");
		}
	}
}
