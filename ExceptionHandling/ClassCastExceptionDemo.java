abstract class Fruit{
	abstract public void info();
}

abstract class Vegetable{
	abstract public void info();
}

class Apple extends Fruit{
	public void info(){
		System.out.println("I am apple.");
	}
}

class Tomato extends Vegetable{
	public void info(){
		System.out.println("I am Tomato");
	}
}

public class ClassCastExceptionDemo{
	private static void printInfo(Object obj){
		try{
			((Vegetable)obj).info();
		}catch(ClassCastException cce){
			System.out.println("I need vegetable not fruit.");
		}
	}
	
	public static void main(String args[]){
		printInfo(new Apple());	
	}
}
