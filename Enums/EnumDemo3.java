enum Color{R,G,B}

public class EnumDemo3{
	public static void main(String args[]){
		Color col;
		for(Color c:Color.values()){
			System.out.println(c);
		}
	}
}
