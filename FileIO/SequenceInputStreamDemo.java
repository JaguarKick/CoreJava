import java.io.*;

public class SequenceInputStreamDemo{
	public static void main(String args[]) throws Exception{
		FileInputStream fis1 = new FileInputStream("Earth.txt");
		FileInputStream fis2 = new FileInputStream("Mars.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
		int data;
		while((data=sis.read())!=-1){
			System.out.print((char)data);
		}
		sis.close();
		fis1.close();
		fis2.close();
		System.out.println();
	}
}
