class MyClass{
	public void info(){
		System.out.println("This is coming from MyClass.");
	}
}

public class ClassDemo2{
	public static void main(String args[]){
		MyClass cd2 = new MyClass();
		cd2.info();
		cd2.info();
		cd2.info();
	}
}
