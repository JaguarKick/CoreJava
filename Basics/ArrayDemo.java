public class ArrayDemo{
	public static void main(String args[]){
		int num[] = {45,64,23,66,74,84,25,74,23};
		int max = 0;
		for(int i=0;i<num.length;i++){
			if(num[i]>max)
				max = num[i];
		}
		System.out.println(max);
	}
}
