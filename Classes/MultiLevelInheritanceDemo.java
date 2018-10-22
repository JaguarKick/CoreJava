class Fruit{
	public void info(){
		System.out.println("Fruit with no info.");
	}
}

class Apple extends Fruit{
	public void info(){
		System.out.println("This is an Apple.");
	}
	public void price(){
	}
}

class GreenApple extends Apple{
	public void info(){
		System.out.println("This is green apple.");
	}
	public void price(){
		System.out.println("50/Kg");
	}
}

class RedApple extends Apple{
	public void info(){
		System.out.println("This is Red Apple.");
	}
	public void price(){
		System.out.println("100/Kg");
	}
}


public class MultiLevelInheritanceDemo{
	public static void main(String args[]){
		Apple gApple = new GreenApple();
		gApple.info();
		gApple.price();
		gApple = new RedApple();
		gApple.info();
		gApple.price();
	}
}
