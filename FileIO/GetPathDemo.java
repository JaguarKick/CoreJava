import java.io.*;

public class GetPathDemo{
	public static void main(String args[]){
		File file = new File("Earth.txt");
		System.out.println("Path of the file is : "+file.getAbsolutePath());
	}
}
