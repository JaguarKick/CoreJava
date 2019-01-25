public class NumberFormatExceptionDemo{
	public static void main(String args[]){
		int num = 0;
		try{
			num = Integer.parseInt(args[0]);
			System.out.println("Square of " + num + " is : " + (num*num));
		}catch(NumberFormatException nfe){
			System.out.println("Numeric input required.");
		}
	}
}
