public class AndDemo{
	public static void main(String args[]){
		boolean flagA = true;
		boolean flagB = true;
		boolean flagC = true;
		if(flagA && flagB && flagC)
			System.out.println("All good.");
		else
			System.out.println("Something's not right.");
	}
}
