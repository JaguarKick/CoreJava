class Abc{
	public static void info(){
		System.out.println("This class contains info on Abc.");
	}
}

class Xyz extends Abc{
	public static void info(){
		System.out.println("This class contains info on Xyz.");
	}
}

public class MethodHidingDemo{
	public static void main(String args[]){
		Abc.info();
		Xyz.info();
	}
}
