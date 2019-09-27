interface Student {
	public void info(int rollNo, String s);
}

public class LambdaDemo2 {
	public static void main(String args[]) {
		AbsClass ac = (int rollNo, String name)->System.out.println("Hello " + name +". Your roll no is " + rollNo + ".");
		ac.info(34,"Sam");
	}
}
