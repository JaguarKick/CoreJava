class KingVegeta{
	public void kingVegetaInfo(){
		System.out.println("I'm king Vegeta, I'm the King of planet Vegeta");
	}
}

class Vegeta extends KingVegeta{
	public void vegetaInfo(){
		System.out.println("I'm vegeta, prince of all saiyans");
	}
}

class Trunks extends Vegeta{
	public void trunksInfo(){
		System.out.println("I'm trunks, son of Vegeta");
	}
}

public class MultiLevelInheritanceDemo{
	public static void main(String args[]){
		Trunks tr = new Trunks();
		tr.kingVegetaInfo();
		tr.vegetaInfo();
		tr.trunksInfo();
	}
}
