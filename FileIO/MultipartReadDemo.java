import java.io.*;

public class MultipartReadDemo{
	public static void main(String args[]) throws Exception{
		byte []data = new byte[8];
		FileInputStream fis = new FileInputStream(args[0]);
		int dataSize = fis.available();
		int i=0;
		System.out.println("Filesize is : "+dataSize);
		while(i<=dataSize){
			if((dataSize-i)>=8)
				fis.read(data);
			else{
				data = new byte[dataSize-i];
				fis.read(data);
			}
			System.out.print(new String(data));
			//System.out.println("Bytes read : "+data.length);
			i+=8;
		}
		fis.close();
	}
}
