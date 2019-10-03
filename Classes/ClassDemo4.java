class MyClass{
	public String info(){
		return "This is coming from MyClass.";
	}
}

public class ClassDemo4{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		System.out.println(mc.info());
	}
}
