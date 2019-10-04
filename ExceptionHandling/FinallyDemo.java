public class FinallyDemo{
	public static void main(String args[]) {
		try{
			System.out.println("I'm inside the try-catch block");
		}catch(Exception e){
		}finally {
			System.out.println("I'm inside the finally block");
		}
	}
}
