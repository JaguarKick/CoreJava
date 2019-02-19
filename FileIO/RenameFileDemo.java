import java.io.*;

public class RenameFileDemo{
	public static void main(String args[]){
		File file = null;
		try{
			file = new File(args[0]);
			file.renameTo(new File(args[1]));
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println(aio);
		}
	}
}
