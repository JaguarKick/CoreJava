class Info{
	public void info(){
		System.out.println("This is a simple info.");
	}
	public void info(String s){
		System.out.println("String called.");
	}
	public void info(byte b){
		System.out.println("Bytes called.");
	}
	public void info(int d){
		System.out.println("Double called");
	}
}

public class MethodOverloadingInClasses{
	public static void main(String args[]){
		Info inf = new Info();
		inf.info();
		inf.info((byte)1);
		inf.info((short)4);
	}
}
