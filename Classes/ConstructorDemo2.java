class MyClass{
	private int num;
	MyClass(int n){
		num = n;
	}
	public void showNum(){
		System.out.println("The number is : "+num);
	}
}

public class ConstructorDemo2{
	public static void main(String args[]){
		new MyClass(34).showNum();
		new MyClass(12).showNum();
		new MyClass(18).showNum();
	}
}
