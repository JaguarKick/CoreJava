import java.io.*;

public class DeleteFileDemo{
	public static void main(String args[]){
		File file = null;
		try{
			file = new File(args[0]);
			if(!file.exists()){
				System.out.println("File does not exists.");
			} else {
				file.delete();
				System.out.println("File has been deleted.");
			}
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println("File name not specified.");
		}
	}
}
