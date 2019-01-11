public class ComparingStrings{
	public static void main(String args[]){
		String var1 = "Hello World";
		String var2 = "Hello World";
		String var3 = new String("Hello World");

		if(var1==var2)
			System.out.println("Validation 1 passed.");
		
		if(var1.equals(var2))
			System.out.println("Validation 2 passed.");

		if(var1==var3)
			System.out.println("Validation 3 passed.");
	
		if(var1.equals(var3))
			System.out.println("Validation 4 passed.");
	}
}
