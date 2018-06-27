public class MultiWhileLoopDemo{
	public static void main(String args[]){
		int i=1, j=1;
		while(i<10){
			j = 1;
			while(j<i){
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
