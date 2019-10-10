import java.io.*;

public class DataInputStreamDemo {
	public static void main(String args[]) throws Exception {
		FileInputStream fis = new FileInputStream("Student");
		DataInputStream dis = new DataInputStream(fis);
		int count = dis.available();
		byte data[] = new byte[count];
		dis.read(data);
		for(byte d:data) {
			System.out.print((char)d);
		}
		dis.close();
	}
}
