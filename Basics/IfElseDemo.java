public class IfElseDemo{
	public static void main(String args[]){
		int a = 45, b = 5, c = 34;
		if(a>b){
			if(a>c){
				System.out.println("A is the greatest.");
			} else {
				System.out.println("C is the greatest.");
			}
		} else {
			if(b>c){
				System.out.println("B is the greatest.");
			} else {
				System.out.println("C is the greatest.");
			}
		}
	}
}
