class Writer{
	public static void write(){
		System.out.println("Writing...");
	}
}

class Author extends Writer{
	public static void write(){
		System.out.println("Writing book.");
	}
}

public class InheritanceDemo4 extends Writer{
	public static void write(){
		System.out.println("Writing code.");
	}
	public static void main(String args[]){
		Author w = new InheritanceDemo4();
		w.write();
	}
}
