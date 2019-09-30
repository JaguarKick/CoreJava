interface Message {
	public String printMessage();
}

public class LambdaDemo4 {
	public static void main(String args[]) {
		Message msg = ()->{ return "This is a simple message"; };
		System.out.println(msg.printMessage());
	}
}
