enum GAMES{
	GOW("God of War"),
	COD("Call of Duty"),
	MK("Mortal Kombat"),
	FW("Farmville"){
		public String comment(){
			return "You're no gamer !!";
		}
	};
	public String comment(){
		return "True gamer !!";
	}
	private String title;
	GAMES(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}
}

public class EnumDemo8{
	public static void main(String args[]){
		GAMES cod = GAMES.COD;
		GAMES gow = GAMES.GOW;
		GAMES fw = GAMES.FW;

		System.out.println(cod.comment());
		System.out.println(fw.comment());
		System.out.println(gow.comment());
	}
}
