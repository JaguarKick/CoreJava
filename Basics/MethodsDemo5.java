public class MethodsDemo5{
	private static void info1(){
		System.out.println("info 1.");
	}

	private static void info2(){
		System.out.println("Info 2.");
		info1();
	}

	public static void main(String args[]){
		info2();
	}
}
