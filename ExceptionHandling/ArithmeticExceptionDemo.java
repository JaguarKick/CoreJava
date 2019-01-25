public class ArithmeticExceptionDemo{
	public static void main(String args[]){
		try{
			System.out.println(4/0);
		}catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
	}
}
