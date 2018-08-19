class MyClass{
	MyClass(){
		System.out.println("No Parameter");
	}
	MyClass(int num){
		System.out.println("Numeric parameter.");
	}
}

public class ConstructorDemo3{
	public static void main(String args[]){
		new MyClass();
		new MyClass(1);
	}
}
