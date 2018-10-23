class MyClass{
	public static void info(){
		System.out.println("This is some information.");
	}
	public void test(){
		info();
	}
}

class AnotherClass{
	public void info(){
		MyClass mc = new MyClass();
		mc.info();
	}
}

public class ClassDemo3{
	public static void main(String args[]){
		AnotherClass anoc = new AnotherClass();
		anoc.info();
		MyClass.info();
	}
}
