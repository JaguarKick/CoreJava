interface MyInterface1{
	public void info1();
}

interface MyInterface2{
	public void info2();
}

class MyClass implements MyInterface1, MyInterface2{
	public void info1(){
		System.out.println("This is information 1.");
	}

	public void info2(){
		System.out.println("This is information 2.");
	}
}

public class InterfaceDemo3{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		mc.info1();
		mc.info2();
	}
}
