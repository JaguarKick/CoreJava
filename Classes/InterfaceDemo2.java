interface MyInterface{
	public void info1();
	public void info2();
}

abstract class MyClass implements MyInterface{
	public void info1(){
		System.out.println("This is information 1.");
	}
}

class MyExtClass extends MyClass{
	public void info2(){
		System.out.println("This is information 2.");
	}
}

public class InterfaceDemo2{
	public static void main(String args[]){
		new MyExtClass().info1();
		new MyExtClass().info2();
	}
}
