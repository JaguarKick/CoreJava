public class StaticInitializerDemo{
	private static String name = "Hello";
	static{
		name = "Sam Paul";
	}
	public static void main(String args[]){
		System.out.println(name);
	}
}
