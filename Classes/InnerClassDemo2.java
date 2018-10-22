class OuterClass{
	public void info(){
		class InnerClass{
			public void info(){
				System.out.println("This message is coming from InnerClass.");
			}
		};
		System.out.println("This message is coming from outer class.");
		new InnerClass().info();
	}
}

public class InnerClassDemo2{
	public static void main(String args[]){
		new OuterClass().info();
	}
}
