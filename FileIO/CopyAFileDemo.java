import java.io.*;

public class CopyAFileDemo{
	public static void main(String args[]){
		String srcFile = null;
		String destFile = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int dataRead;

		try{
			srcFile = args[0];
			destFile = args[1];
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(destFile);
			while((dataRead=fis.read())!=-1){
				fos.write(dataRead);
			}
			fis.close();
			fos.flush();
			fos.close();
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println("Command usage :-");
			System.out.println("java CopyAFileDemo <Src_File> <Dest_file>");
		}catch(IOException ioe){
			System.out.println(ioe);
		}
	}
}
