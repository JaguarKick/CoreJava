public class PartialInitializationDemo {
	public static void main(String args[]) {
		int num;
			if(false)
				num = 10;
			else
				num = 34;
				
		System.out.println(num);
	}
}

/*
If ELSE statement is not included.. this code will throw the following error :-

PartialInitializationDemo.java:9: error: variable num might not have been initialized
		System.out.println(num);
*/
