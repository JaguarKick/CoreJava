public class MultiCatchDemo{
	public static void main(String args[]){
		int num = 0;
		try{
			num = Integer.parseInt(args[0]);
			System.out.println(num*num);
		}catch(NumberFormatException nfe){
			System.out.println("Numeric input required.");
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println("Some numeric input required.");
		}
	}
}
