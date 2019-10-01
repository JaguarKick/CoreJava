public class ArrayDemo2 {
	public static void main(String args[]) {
		int []num = {45,23,53,77,33,74,78,23};
		for(int i=0;i<num.length;i++) {
			num[i] = num[i] * 2;
		}

		for(int n:num) {
			System.out.println(n);
		}
	}
}
