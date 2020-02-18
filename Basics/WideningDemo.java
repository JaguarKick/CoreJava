public class WideningDemo {
	public static void main(String args[]) {
		byte myBytes = 10;
		short myShort;
		int myInt;
		long myLong;
		float myFloat;
		double myDouble;
		myDouble = myFloat = myLong = myInt = myShort = myBytes;
		System.out.println(myDouble);
	}
}
