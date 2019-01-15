class MyClass{
	public static void info(){
		System.out.println("This information is coming from MyClass.info");
	}

	public static void anotherNote(){
		System.out.println("This is another note coming from MyClass.anotherNote");
	}
}

public class StaticMethodsDemo{
	public static void main(String args[]){
		MyClass.info();
		MyClass.anotherNote();
	}
}
