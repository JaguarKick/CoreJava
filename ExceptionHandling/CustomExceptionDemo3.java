import java.io.*;
class MyException extends RuntimeException{
	MyException(){
		super();
	}

	MyException(String message){
		super(message);
	}
	MyException(Throwable thr){
		super(thr);
	}
}

public class CustomExceptionDemo3{
	public static void main(String args[]){
		try{
			throw new MyException();
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			throw new MyException("Custom Exception");
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			throw new MyException(new IOException());
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
