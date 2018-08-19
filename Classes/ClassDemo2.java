class MyClass1{
	public void info(){
		System.out.println("This is my class.");
	}
}

class MyClass2{
	public void info(){
		System.out.println("This is my class 2.");
	}
}

public class ClassDemo2{
	public static void main(String args[]){
		new MyClass1().info();
		new MyClass2().info();
	}
}
