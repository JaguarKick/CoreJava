import java.io.*;

public class DataOutputStreamDemo {
	public static void main(String args[]) throws Exception {
		String studName = args[0];
		int rollNo = Integer.parseInt(args[1]);
		FileOutputStream file = new FileOutputStream("Student");
		DataOutputStream dos = new DataOutputStream(file);
		dos.writeInt(rollNo);
		dos.writeUTF(studName);
		dos.flush();
		dos.close();
		file.close();
	}
}
