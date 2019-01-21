abstract class AbsClass{
	public abstract void info1();
	public abstract void info2();
	public void info3(){
		System.out.println("This is info 3.");
	}
}

class MyClass extends AbsClass{

	public void info1(){
		System.out.println("This is info 1.");
	}

	public void info2(){
		System.out.println("This is info 2.");
	}
}

public class AbstractClassDemo{
	public static void main(String args[]){
		MyClass myClass = new MyClass();
		myClass.info1();
		myClass.info2();
		myClass.info3();
	}
}
