public class ArrayCopyDemo {
	public static void main(String args[]) {
		String []names = {"Sam","James","John","Mike","Tony","Steve","Natasha"};
		String []namesCopy = new String[7];
		System.arraycopy(names,0,namesCopy,0,7);
		for(String s:namesCopy) {
			System.out.println(s);
		}
	}
}
