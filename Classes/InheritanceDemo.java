class Fruit{
	Fruit(){
		System.out.println("This is a fruit class.");
	}
	public void info(){
		System.out.println("Some info about fruit.");
	}
}

class Apple extends Fruit{
	Apple(){
		System.out.println("This is the apple class.");
	}
	public void info(){
		System.out.println("Some info about apple.");
	}
}

public class InheritanceDemo{
	public static void main(String args[]){
		new Fruit().info();
		new Apple().info();
	}
}
