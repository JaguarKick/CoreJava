class MyClass{
	int num = 45;
	public int add(int n){
		return num+n;
	}
}

public class ClassDemo5{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		System.out.println(mc.add(45));
	}
}
