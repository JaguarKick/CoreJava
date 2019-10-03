class Abc{
	String name;
	Abc(String str){
		name = str;
	}
	public String getName(){
		return name;
	}
}

public class ConstructorDemo2{
	public static void main(String args[]){
		Abc abc = new Abc("Sam");
		System.out.println(abc.getName());
	}
}
