public class VarArgsDemo2{
	private static void displayInfo(int n, String...names){
		for(String s:names){
			System.out.println(s);
		}
		System.out.println(n);
	}

	public static void main(String args[]){
		displayInfo(34,"Sam","James","John","Mike","Rivera");
	}
}
