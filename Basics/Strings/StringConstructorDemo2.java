public class StringConstructorDemo2 {
	public static void main(String args[]) {
		int []num =new int[26];
		int i=0;
		for(char ch='a';ch<='z';ch++, i++) {
			num[i] = (int)ch;
		}
		String intString = new String(num,3,26-3); //new String(array,offset,length)
		System.out.println(intString);
	}
}
