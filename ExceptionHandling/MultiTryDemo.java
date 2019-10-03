public class MultiTryDemo{
	public static void main(String args[]){
		try{
			int num = Integer.parseInt(args[0]);
			try{
				System.out.println(10/num);
			}catch(ArithmeticException ai){
				System.out.println("Some foolishness detected.");
			}
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println("Say something you idiot !!");
		}catch(NumberFormatException nfe){
			System.out.println("Do you know what numeric is??");
		}
	}
}
