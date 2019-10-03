import java.io.*;

public class ListFilesDemo{
	public static void main(String args[]){
		File search = null;
		String files[] = null;
		File file = null;
		try{
			search = new File(args[0]);
			files = search.list();
			for(String s:files){
				System.out.println(s);
			}
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println(aio);
		}
	}
}
