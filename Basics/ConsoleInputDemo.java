import java.io.*;

public class ConsoleInputDemo{
	public static void main(String args[]) throws Exception{
		Console con = System.console();
		System.out.println("What's your name ?");
		String name = con.readLine();
		System.out.println("Hello " + name);
	}
}
