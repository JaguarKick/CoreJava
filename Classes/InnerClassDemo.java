class Class1{
	class Class2{
		public void info(){
			System.out.println("This is Class2 that exists within Class 1.");
		}
	};
	public void info(){
		System.out.println("This is Class 1.");
	}
}

public class InnerClassDemo{
	public static void main(String args[]){
		Class1.Class2 obj1 = new Class1().new Class2();
		obj1.info();
	}
}
