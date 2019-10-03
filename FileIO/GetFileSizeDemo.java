import java.io.*;

public class GetFileSizeDemo{
	public static void main(String args[]){
		File file = new File("Earth.txt");
		System.out.println("Filesize is : "+file.length());
	}
}
