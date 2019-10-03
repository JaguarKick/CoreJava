import java.io.*;

public class BufferedOutputStreamDemo{
	public static void main(String args[]) throws Exception{
		FileOutputStream fos = new FileOutputStream("Sam.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("My name is Sam and I'm a loser !!".getBytes());
		bos.flush();
		bos.close();
		fos.close();
	}
}
