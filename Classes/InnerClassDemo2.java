class OuterClass{
	public void info(){
		System.out.println("In the outer class.");
		class InnerClass{
			public void info(){
				System.out.println("This is an inner class.");
			}
		}
		new InnerClass().info();
	}
}

public class InnerClassDemo2{
	public static void main(String args[]){
		OuterClass outClass = new OuterClass();
		outClass.info();
	}
}
