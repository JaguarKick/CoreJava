import java.io.*;

public class IsDirectoryOrFileDemo{
	public static void main(String args[]){
		File file = null;
		try{
			file = new File(args[0]);
			System.out.println("Is Directory 	: " + file.isDirectory());
			System.out.println("Is File		: " + file.isFile());
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println(aio);
		}
	}
}
