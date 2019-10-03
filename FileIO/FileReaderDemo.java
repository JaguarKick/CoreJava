import java.io.*;

public class FileReaderDemo{
	public static void main(String args[]){
		char []ch = new char[100];
		try{
			File file = new File("Earth.txt");
			FileReader fr = new FileReader(file);
			int fileSize = fr.read(ch);
			System.out.println("Size of file is " + fileSize + " bytes.");
			System.out.println("Data written in the file is : " + new String(ch));
			fr.close();
		}catch(FileNotFoundException fnf){
			System.out.println("Earth.txt does not exists.");
		}catch(IOException ioe){
			System.out.println("Failed to read from Earth.txt");
		}
	}
}
