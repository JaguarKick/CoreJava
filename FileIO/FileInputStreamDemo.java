import java.io.*;

public class FileInputStreamDemo{
	public static void main(String args[]) throws Exception{
		FileInputStream fis = new FileInputStream("Earth.txt");
		int dataRead = 0;
		while((dataRead=fis.read())!=-1){
			System.out.print((char)dataRead);
		}
		fis.close();
	}
}
