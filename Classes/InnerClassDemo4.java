class OuterClass{
	private int num = 11;
	class InnerClass{
		private int num = 34;
		public void info(){
			System.out.println("Inside InnerClass.");
			System.out.println("Num for InnerClass : " + num);
			System.out.println("Num for OuterClass : " + new OuterClass().num);
		}
	};

	public void info(){
		new InnerClass().info();
	}
}

public class InnerClassDemo4{
	public static void main(String args[]){
		new OuterClass().info();
	}
}
