import java.io.*;

public class FileWriterDemo{
	public static void main(String args[]) throws Exception{
		File file = new File("Earth.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("Earth is the third planet of our Solar System.");
		fw.flush();
		fw.close();
	}
}
