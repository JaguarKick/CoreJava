public class ExceptionDemo{
	public static void main(String args[]){
		try{
			throw new NullPointerException("Studid thing is nullified.");
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}
}
