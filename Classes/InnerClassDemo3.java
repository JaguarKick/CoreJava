class OuterClass{
	private int num = 20;
	public void info(){
		System.out.println("I'm in the outer class and I can read " + num);
		class InnerClass{
			public void info(){
				System.out.println("I'm in the inner class and I can read " + num);
			}
		}
		new InnerClass().info();
	}
}

public class InnerClassDemo3{
	public static void main(String args[]){
		new OuterClass().info();
	}
}
