public class ThrowDemo{
	public static void main(String args[]){
		try{
			throw new NullPointerException("Some shit happened !!");
		}catch(NullPointerException npe){
			System.out.println(npe);
		}
	}
}
