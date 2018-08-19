class Class1{
	private int num;
	Class1(int num){
		this.num = num;
	}
	public int getNum(){
		return num;
	}
}

class Class2 extends Class1{
	private int num;
	Class2(int num1, int num2){
		super(num1);
		this.num = num2;
	}
	public void showAllNum(){
		System.out.println("Class2 : "+num);
		System.out.println("Class1 : "+super.getNum());
	}
}

public class SuperDemo3{
	public static void main(String args[]){
		new Class2(35,72).showAllNum();
	}
}
