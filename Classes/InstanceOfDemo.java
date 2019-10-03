class Fruit{
	public void info(){
		System.out.println("I am a fruit class.");
	}
}

class Apple extends Fruit{
	public void info(){
		System.out.println("I'm a fruit. I'm called Apple.");
	}
}

public class InstanceOfDemo{
	public static void main(String args[]){
		Fruit apple = new Apple();
		if(apple instanceof Apple){
			apple.info();
		}
	}
}
