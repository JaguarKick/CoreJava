public class NullPointerExceptionDemo{
	public static void main(String args[]){
		try{
			String str = null;
			System.out.println("Variable str has : "+str);
			System.out.println(str.toCharArray());
		}catch(NullPointerException npe){
			System.out.println(npe);
		}
	}
}
