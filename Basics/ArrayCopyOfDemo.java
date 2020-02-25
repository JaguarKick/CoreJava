import java.util.*;

public class ArrayCopyOfDemo {
	public static void main(String args[]) {
		Integer[] numArray = {45,232,565,342,12,745,54,854,45,34,7,854,55};
		Integer[] numCopy = Arrays.copyOf(numArray,numArray.length);
		for(int n:numCopy)
			System.out.println(n);
	}
}
