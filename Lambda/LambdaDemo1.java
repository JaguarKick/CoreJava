interface AbsClass {
	public void info(int x);
}

public class LambdaDemo1 {
	public static void main(String args[]) {
		AbsClass ac = (int x)->System.out.println(x);
		ac.info(5);
	}
}
