class Abc{
	public void info(){
		System.out.println("This is from Abc class.");
	}
}

class Xyz extends Abc{
	public void info(){
		super.info();
		System.out.println("This is from Xyz class.");
	}
}

public class SuperDemo2{
	public static void main(String args[]){
		Xyz xyz = new Xyz();
		xyz.info();
	}
}
