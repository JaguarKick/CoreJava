class OuterClass{
	private int num = 34;
	class InnerClass{
		private int num = 11;
		public void info(){
			System.out.println("From InnerClass 	: " + num);
		}
	};
	public void info(){
		System.out.println("From OuterClass	: " + num);
		new InnerClass().info();
	}
}

public class InnerClassDemo3{
	public static void main(String args[]){
		new OuterClass().info();
	}
}

