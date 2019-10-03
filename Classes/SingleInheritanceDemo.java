class Bardock{
	public void bardockInfo(){
		System.out.println("I'm bardock, father of Goku");
	}
}

class Goku extends Bardock{
	public void gokuInfo(){
		System.out.println("I'm Goku son of Bardock");
	}
}

public class SingleInheritanceDemo{
	public static void main(String args[]){
		Goku g = new Goku();
		g.bardockInfo();
		g.gokuInfo();
	}
}
