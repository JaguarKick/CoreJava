class Abc{
	Abc(){
		System.out.println("This is from Abc class.");
	}
}

class Xyz extends Abc{
	Xyz(){
		super();
		System.out.println("I'm from Xyz class.");
	}
}

public class SuperDemo{
	public static void main(String args[]){
		Xyz xyz = new Xyz();
	}
}
