public class ThrowsDemo{
	private static void info(int num) throws ArithmeticException{
		System.out.println(10/num);
	}
	
	public static void main(String args[]){
		try{
			info(Integer.parseInt(args[0]));
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
