import java.util.*;
public class ArrayFillDemo {
	public static void main(String args[]) {
		Integer[] numArray = new Integer[10];
		Arrays.fill(numArray,2);
		for(int n:numArray)
			System.out.println(n);
	}
}
