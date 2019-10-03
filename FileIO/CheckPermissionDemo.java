import java.io.*;

public class CheckPermissionDemo{
	public static void main(String args[]){
		File file = new File("Earth.txt");
		System.out.println("Can Read	: "+file.canRead());
		System.out.println("Can Write	: "+file.canWrite());
	}
}
