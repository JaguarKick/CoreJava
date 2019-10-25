import java.io.*;

public class WriterDemo {
	public static void main(String args[]) {
		try {
			Writer w = new FileWriter("Earth.txt");
			w.write("Earth is the third planet of our Solar System.");
			w.close();
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
	}
}
