import java.io.*;

public class FileNotFoundExceptionDemo{
	public static void main(String args[]){
		try{
			FileReader file = new FileReader(args[0]);
		}catch(FileNotFoundException fnf){
			System.out.println(fnf);
		}
	}
}
