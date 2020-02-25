class Thing {
	String firstString;
	String secondString;
	static String thirdString;

	Thing() {
		secondString = "b";
	}

	{
		firstString = "a";
	}

	static {
		thirdString = "c";
	}
	
	public String toString() {
		return firstString + secondString + thirdString;
	}
}

public class ForwardReferenceDemo {
	public static void main(String args[]) {
		Thing one = new Thing();
		System.out.println(one);
	}
}
