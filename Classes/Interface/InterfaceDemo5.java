interface Abc1{
	public void info1();
}

interface Abc2{
	public void info2();
}

interface Abc3{
	public void info3();
}

interface Abc4 extends Abc1, Abc2, Abc3{
	public void info4();
}

class MyClass implements Abc4{
	public void info1(){
		System.out.println("Information 1.");
	}
	
	public void info2(){
		System.out.println("Information 2.");
	}
	
	public void info3(){
		System.out.println("Information 3.");
	}
	
	public void info4(){
		System.out.println("Information 4.");
	}
}

public class InterfaceDemo5{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		mc.info1();
		mc.info2();
		mc.info3();
		mc.info4();
	}
}
