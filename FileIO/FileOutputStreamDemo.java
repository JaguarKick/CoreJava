import java.io.*;

public class FileOutputStreamDemo{
	public static void main(String args[]) throws Exception{
		FileOutputStream fos = new FileOutputStream("Earth.txt");
		fos.write(args[0].getBytes());
		fos.flush();
		fos.close();
	}
}
