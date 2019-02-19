import java.io.*;

public class CreateDirectoryAndFile{
	public static void main(String args[]) throws Exception{
		File dir = new File("Temp");
		dir.mkdir();
		File file = new File(dir,"Sam.txt");
		file.createNewFile();
	}
}
