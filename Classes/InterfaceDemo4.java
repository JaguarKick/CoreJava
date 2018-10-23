interface MyInt1{
	public void info1();
}

interface MyInt2{
	public void info2();
}

interface MyInterface extends MyInt1, MyInt2{
	public void info3();
}

class MyClass implements MyInterface{
	public void info1(){
		System.out.println("This is information 1.");
	}


	public void info2(){
		System.out.println("This is information 2.");
	}

	public void info3(){
		System.out.println("This is information 3.");
	}
}

public class InterfaceDemo4{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		mc.info1();
		mc.info2();
		mc.info3();
	}
}
