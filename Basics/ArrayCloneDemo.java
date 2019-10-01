public class ArrayCloneDemo {
	public static void main(String args[]) {
		int num[] = {45,23,56,24,73,25,62,73,24,67};
		int numCopy[] = num.clone();
		for(int n:numCopy) {
			System.out.println(n);
		}
	}
}
