class OuterClass{
	private static void info(){
		System.out.println("I'm in the outer class.");
	}

	static class InnerClass{
		public static void info(){
			System.out.println("I'm in the inner class.");
			OuterClass.info();
		}
	}
}

public class StaticInnerClassDemo{
	public static void main(String args[]){
		OuterClass.InnerClass.info();
	}
}

