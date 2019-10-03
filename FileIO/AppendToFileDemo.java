import java.io.*;

public class AppendToFileDemo{
	public static void main(String args[]) throws Exception{
		FileOutputStream fos = new FileOutputStream("Earth.txt",true);
		fos.write(args[0].getBytes());
		fos.close();
	}
}
		
