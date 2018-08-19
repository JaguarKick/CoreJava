class Class1{
	int num;
	Class1(){}
	Class1(int num){
		this.num = num;
	}
	public int getNum(){
		return num;
	}
}

class Class2 extends Class1{
	int num;
	Class2(int num){
		this.num = num;
	}
	public void showAllNum(){
		System.out.println(super.num);
		System.out.println(num);
	}
}

public class SuperDemo{
	public static void main(String args[]){
		System.out.println(new Class1(45).getNum());
		new Class2(62).showAllNum();
	}
}
