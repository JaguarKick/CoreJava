public class VarArgsDemo{
	public static void names(String...names){
		for(String s:names){
			System.out.println(s);
		}
	}

	public static void main(String args[]){
		names("Goku","Vegeta","Gohan","Android 17","Android 18","Piccolo","Master Roshi","Tein","Freeza","Krillin");
	}
}
