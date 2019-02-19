import java.io.*;

public class BufferedReaderDemo{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
		String str = null;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
	}
}
