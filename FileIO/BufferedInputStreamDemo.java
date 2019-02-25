import java.io.*;

public class BufferedInputStreamDemo{
	public static void main(String args[]) throws Exception{
		int data;
		FileInputStream fis = new FileInputStream("Sam.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		while((data=bis.read())!=-1){
			System.out.print((char)data);
		}
		bis.close();
		fis.close();
	}
}
