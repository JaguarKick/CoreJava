public class ArrayIndexOutOfBoundsExceptionDemo{
	public static void main(String args[]){
		try{
			System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println("No inputs " + aio);
		}
	}
}
