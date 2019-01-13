public class VarArgsDemo2{
	public static void info(int num,String...names){
		System.out.println("These "+num+" people are awesome !");
		for(String s:names){
			System.out.println(s);
		}
	}
	public static void main(String args[]){
		info(5,"Broly","Rock Lee","Zaraki Kenpachi","Greed","Dracule Mihawk");
	}
}
