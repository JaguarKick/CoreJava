abstract class Class1 extends AbsClass{
	public void info1(){
		System.out.println("This is info 1.");
	}
}

class Class2 extends Class1{
	public void info2(){
		System.out.println("This is info 2.");
	}
}

public class AbstractClassDemo2{
	public static void main(String args[]){
		Class2 c2 = new Class2();
		c2.info1();
		c2.info2();
		c2.info3();
	}
}
