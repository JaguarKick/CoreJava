/** JavaDocsDemo is just an example to show how Javadocs works. */
public class JavaDocsDemo{
	/** info returns some information. */
	public static void info(){
		System.out.println("This is just an info.");
	}
	/** secret() reveals some secret information. This method is private. */
	private static void secret(){
		System.out.println("This method contains some secret info.");
	}
	/** This method add two numbers and displays the sum of it. */
	private static void add(int n1,int n2){
		System.out.println(n1+n2);
	}
	/** This is the main method */
	public static void main(String args[]){
		info();
		secret();
		add();
	}
}
