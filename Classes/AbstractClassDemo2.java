abstract class AbsClass{
	abstract public void info1();
	abstract public void info2();
	public void about(){
		System.out.println("This is about AbsClass.");
	}
}

abstract class Class1 extends AbsClass{
	public void info1(){
		System.out.println("Overriden inside Class1");
	}
}

class Class2 extends Class1{
	public void info2(){
		System.out.println("Overriden inside Class2");
	}
}

public class AbstractClassDemo2{
	public static void main(String args[]){
		new Class2().info1();
		new Class2().info2();
	}
}
