public class MethodsDemo3{
	private static String greet(String name){
		return "Hello "+name;
	}
	
	public static void main(String args[]){
		System.out.println(greet("Sam"));
		System.out.println(greet("Adam"));
	}
}
