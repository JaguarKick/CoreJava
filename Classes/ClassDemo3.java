class MyClass{
	public void info(String str){
		System.out.println("The message from MyClass is : "+str);
	}
}

public class ClassDemo3{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		mc.info("Hello, How are you?");
	}
}
