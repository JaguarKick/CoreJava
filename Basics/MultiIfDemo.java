public class MultiIfDemo{
	public static void main(String args[]){
		int a = 23, b = 26, c = 12;
		if(a>b){
			if(a>c){
				System.out.println("A is the greatest number.");
			} else {
				System.out.println("C is the greatest number.");
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
