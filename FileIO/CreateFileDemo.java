import java.io.*;

public class CreateFileDemo{
	public static void main(String args[]) throws Exception{
		File file = new File("MyFile");
		if(!file.exists()){
			System.out.println("MyFile does not exists. Creating a new file.");
			file.createNewFile();
		}

		if(file.exists()){
			System.out.println("File exists now.");
		}
	}
}
