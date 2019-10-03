class OuterClass{
	class InnerClass{
		public void info(){
			System.out.println("This is an inner class.");
		}
	}

	public void info(){
		System.out.println("This is an outer class.");
	}
}

public class InnerClassDemo{
	public static void main(String args[]){
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
		innerClass.info();
		new OuterClass().info();
	}
}
