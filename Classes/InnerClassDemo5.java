class OuterClass{
	private int num = 11;
	class InnerClass{
		private int num = 34;
	};
	public void info(){
		System.out.println("Outer class : "+num);
		System.out.println("Inner class : "+new InnerClass().num);
	}
}

public class InnerClassDemo5{
	public static void main(String args[]){
		new OuterClass().info();
	}
}
