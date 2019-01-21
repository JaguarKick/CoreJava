abstract class Abs1{
	public abstract void info1();
}

abstract class Abs2 extends Abs1{
	public abstract void info2();
}

abstract class Abs3 extends Abs2{
	public abstract void info3();
	public void info(){
		System.out.println("This is some general information.");
	}
}

class MyClass extends Abs3{
	public void info1(){
		System.out.println("This is information 1.");
	}
	
	public void info2(){
		System.out.println("This is information 2.");
	}
	
	public void info3(){
		System.out.println("This is informaiton 3.");
	}
}

public class AbstractClassDemo3{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		mc.info1();
		mc.info2();
		mc.info3();
		mc.info();
	}
}
