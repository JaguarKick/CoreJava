enum COUNTRY{
	US, CN, IN, CH, JP, AU, GB, FR, IT;
	public String toString(){
		return this.name();
	}
}

public class EnumDemo4{
	public static void main(String args[]){
		for(COUNTRY c:COUNTRY.values()){
			System.out.println(c);
		}
	}
}
