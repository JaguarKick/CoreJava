interface MyInterface{
	public void info1();
	public void info2();
}

class MyClass implements MyInterface{
	public void info1(){
		System.out.println("This is information 1.");
	}
	public void info2(){
		System.out.println("This is information 2.");
	}
}

public class InterfaceDemo1{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		mc.info1();
		mc.info2();
	}
}
