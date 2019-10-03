class Abc{
	public void info(){
		System.out.println("This class is secured.");
	}
}

public class AnonymousClassDemo{
	public static void main(String args[]){
		Abc abc = new Abc();
		abc.info();
		Abc abc2 = new Abc(){
			public void info(){
				System.out.println("This class has been hacked.");
			}
		};
		abc2.info();
	}
}
