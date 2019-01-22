interface IntC1{
	public void info1();
}

interface IntC2 extends IntC1{
	public void info2();
	public void info3();
}

class MyClass implements IntC2{
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

public class InterfaceDemo3{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		mc.info1();
		mc.info2();
		mc.info3();
	}
}
