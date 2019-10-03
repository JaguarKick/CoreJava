import java.io.Console;

public class PasswordInputDemo{
	public static void main(String args[]) throws Exception{
		char ch[];
		Console con = System.console();
		System.out.print("Enter your password : ");
		ch = con.readPassword();
		if(new String(ch).equals("M@trixc0de")){
			System.out.println("Access granted.");
		} else {
			System.out.println("Access denied.");
		}
	}
}
