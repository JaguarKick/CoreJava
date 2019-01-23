enum GAMES{
	GOW(2999,"God of War"),
	UC4(1999,"Uncharted 4"),
	COD(1999,"Call of Duty");
	private String title;
	private int price;
	
	GAMES(int price, String title){
		this.price = price;
		this.title = title;
	}
	public String getTitle(){
		return title;
	}

	public int getPrice(){
		return price;
	}
}

public class EnumDemo7{
	public static void main(String args[]){
		GAMES game = GAMES.GOW;
		System.out.println(game.getTitle());
		System.out.println(game.getPrice());
	}
}
