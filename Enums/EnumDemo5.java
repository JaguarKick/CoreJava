enum CITY{
	NOIDA(120),
	DELHI(11),
	MUMBAI(22),
	CHENNAI(44),
	KOLKATA(33);

	private CITY(int code){
		this.code = code;
	}
	public final int code;
}

public class EnumDemo5{
	public static void main(String args[]){
		CITY noida = CITY.NOIDA;
		System.out.println("STD CODE FOR NOIDA IS " + noida.code);
	}
}
