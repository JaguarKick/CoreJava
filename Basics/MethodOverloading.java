public class MethodOverloading{
	public static void hello(){
		System.out.println("Hello there");
	}
	
	public static void hello(String name){
		System.out.println("Hello "+name);
	}

	public static void hello(String name,int age){
		System.out.println("Hello "+name+". You're "+age+" years old.");
	}

	public static void main(String args[]){
		hello();
		hello("Sam");
		hello("Sam",45);
	}
}
