import java.io.*;

public class IOExceptionDemo{
	public static void main(String args[]){
		try{
			FileReader fis = new FileReader(args[0]);
			System.out.println(fis.read());
			fis.close();
		}catch(IOException ioe){
			System.out.println("Can't read file.");
		}
	}
}
