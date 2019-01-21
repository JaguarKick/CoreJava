interface Abc{
	public void info1();
	public void info2();
}

class MyClass implements Abc{
	public void info1(){
		System.out.println("Information 1.");
	}
	
	public void info2(){
		System.out.println("Information 2.");
	}
}

public class InterfaceDemo{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		mc.info1();
		mc.info2();
	}
}
