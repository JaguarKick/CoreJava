class OuterClass{
	public void info(){
		System.out.println("I'm in the outer class.");
	}
	class InnerClass{
		public void info(){
			System.out.println("I'm in the inner class.");
			new OuterClass().info();
		}
	}
}

public class InnerClassDemo4{
	public static void main(String args[]){
		new OuterClass().new InnerClass().info();
	}
}
