import java.util.*;

public class StringTokenizerDemo{
	public static void main(String args[]){
		String emailAddress = args[0];
		StringTokenizer token = new StringTokenizer(emailAddress,"@");
		token.nextToken();
		switch(token.nextToken()){
			case "gmail.com" : System.out.println("You're using GMAIL.COM");
			break;
			case "live.com" : System.out.println("You're using windows live.com");
			break;
			case "yahoo.com" : System.out.println("You're using yahoo.com");
			break;
		}
	}
}
