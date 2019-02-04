class Abc{
	public void info(String str) throws NumberFormatException{
		System.out.println("Abc has : "+Integer.parseInt(str));
	}
}

class Xyz extends Abc{
	public void info(String str) throws ArithmeticException{
		System.out.println(6/Integer.parseInt(str));
	}
}

public class ThrowsDemo3{
	public static void main(String args[]){
		Xyz xyz = new Xyz();
		Abc abc = new Abc();
		try{
			abc.info(args[0]);
		}catch(NumberFormatException nfe){
			System.out.println(nfe);
		}
		try{
			xyz.info(args[1]);
		}catch(ArithmeticException ai){
			System.out.println(ai);
		}
		System.out.println("The end.");
	}
}
