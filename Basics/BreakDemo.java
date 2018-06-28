public class BreakDemo{
	public static void main(String args[]){
		int n=0;
		do{
			n++;
			System.out.println("This is line no. "+n);
			if(n==5) break;
		}while(n<10);
	}
}
