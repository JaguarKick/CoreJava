class MyClass extends Exception{
	private String message = "No Message SET";
	MyClass(){}
	MyClass(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}
}

public class CustomExceptionDemo2{
	private static void info() throws Exception{
		System.out.println("I will throw an exception");
		throw new MyClass();
	}
	
	private static void info2() throws Exception{
		System.out.println("I will throw another exception");
		throw new MyClass("A Custom Exception");
	}

	public static void main(String args[]){
		try{
			info();
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			info2();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
