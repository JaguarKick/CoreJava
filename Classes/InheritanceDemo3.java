class Fruit{
	public void info(){
		System.out.println("This is fruit class with no info.");
	}
}

class Apple extends Fruit{
	public void info(){
		System.out.println("This is Apple class.");
	}
}

class Mango extends Fruit{
	public void info(){
		System.out.println("This is Mango class.");
	}
}

public class InheritanceDemo3{
	public static void main(String args[]){
		Fruit fruit = new Apple();
		fruit.info();
		((Mango)fruit).info();
	}
}
