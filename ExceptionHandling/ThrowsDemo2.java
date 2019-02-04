public class ThrowsDemo2{
	private static void showInfo(String num) throws ArithmeticException, NumberFormatException{
		int n = Integer.parseInt(num);
		System.out.println(4/n);
	}

	public static void main(String args[]){
		try{
			showInfo(args[0]);
		}catch(ArithmeticException ae){
			System.out.println(ae);
		}catch(NumberFormatException nfe){
			System.out.println(nfe);
		}
	}
}

