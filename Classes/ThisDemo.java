class MyClass{
	private int num;
	MyClass(int num){
		this.num = num;
	}
	public int getNum(){
		return num;
	}
}

public class ThisDemo{
	public static void main(String args[]){
		System.out.println(new MyClass(45).getNum());
	}
}
