class MyClass{
	public void info(){
		System.out.println("This is some information.");
	}
}

public class AnonymousClassDemo{
	public static void main(String args[]){
		MyClass mc = new MyClass();
		mc.info();

		MyClass anon = new MyClass(){
			public void info(){
				System.out.println("This is some anonymous information.");
			}
		};

		anon.info();
	}
}
