class Abc{
	Abc(){}
	Abc(int n){}
}

class Xyz extends Abc{
	Xyz(int n){}
}

public class ConstructorDemo4{
	public static void main(String args[]){
		new Xyz(12);
	}
}
