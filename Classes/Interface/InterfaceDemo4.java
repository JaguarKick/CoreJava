interface Abc1{
	public void info1();
}

interface Abc2{
	public void info2();
}

interface Abc3{
	public void info3();
}

class MyClass implements Abc1, Abc2, Abc3{
	public void info1(){
		System.out.println("Information 1.");
	}
	
	public void info2(){
		System.out.println("Information 2.");
	}
	
	public void info3(){
		System.out.println("Information 3.");
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
