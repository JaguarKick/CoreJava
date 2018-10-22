class Fruit{
	public void info(){
		System.out.println("Fruit class with no info.");
	}
}

class Apple extends Fruit{
	public void info(){
		System.out.println("This is Apple Class.");
	}
}

class Mango extends Fruit{
	public void info(){
		System.out.println("This is Mango Class.");
	}
}

public class InheritanceDemo2{
	public static void main(String args[]){
		Fruit fruit = new Apple();
		fruit.info();
		fruit = new Mango();
		fruit.info();
	}
}

