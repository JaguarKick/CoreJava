interface Abc{
	public void info1();
	public void info2();
}

abstract class MyClass implements Abc{
	public void info1(){
		System.out.println("Information 1.");
	}
}

class MyClass2 extends MyClass{
	public void info2(){
		System.out.println("Information 2.");
	}
}

public class InterfaceDemo2{
	public static void main(String args[]){
		MyClass2 mc = new MyClass2();
		mc.info1();
		mc.info2();
	}
}
