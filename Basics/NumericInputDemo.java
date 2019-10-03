import java.io.Console;
public class NumericInputDemo{
	public static void main(String args[]) throws Exception{
		Console con = System.console();
		System.out.print("Enter a number : ");
		int num = Integer.parseInt(con.readLine());
		if(num%2==0){
			System.out.println("This is an even number.");
		} else {
			System.out.println("This is an odd number.");
		}
	}
}
