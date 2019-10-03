class MyClass extends Exception{
	public String getMessage(){
		return "This is a custom Exception";
	}
}

public class CustomExceptionDemo{
	private static void info() throws MyClass{
		System.out.println("I will throw an Exception");
		throw new MyClass();
	}
	public static void main(String args[]){
		try{
			info();
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
