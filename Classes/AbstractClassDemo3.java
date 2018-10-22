abstract class AbsClass1{
	abstract public void info1();
	public void aboutAbsClass1(){
		System.out.println("This is from AbsClass1.");
	}
}

abstract class AbsClass2 extends AbsClass1{
	abstract public void info2();
	public void aboutAbsClass2(){
		System.out.println("This is from AbsClass2.");
	}
}


class Class1 extends AbsClass2{
	public void info1(){
		System.out.println("This is info1");
	}
	
	public void info2(){
		System.out.println("This is info2.");
	}
}

public class AbstractClassDemo3{
	public static void main(String args[]){
		new Class1().info1();
		new Class1().info2();
		new Class1().aboutAbsClass1();
		new Class1().aboutAbsClass2();
	}
}
