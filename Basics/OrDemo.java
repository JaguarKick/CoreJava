public class OrDemo{
	public static void main(String args[]){
		boolean flagA = true;
		boolean flagB = false;
		boolean flagC = false;

		if(flagA || flagB || flagC)
			System.out.println("Good, atleast one survived.");
		else
			System.out.println("All dead.");
	}
}
