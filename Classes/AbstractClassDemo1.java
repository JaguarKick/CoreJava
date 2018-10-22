abstract class AbsClass{
	abstract public void info();
	public void about(){
		System.out.println("This is from an abtract class.");
	}
}


class Class1 extends AbsClass{
	public void info(){
		System.out.println("Overridden method from AbsClass.");
	}
}

public class AbstractClassDemo1{
	public static void main(String args[]){
		new Class1().info();
		new Class1().about();
	}
}
