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
		super.num = 82;
	}
	public void showAllNum(){
		System.out.println(super.num);
		System.out.println(num);
	}
}

public class SuperDemo2{
	public static void main(String args[]){
		Class1 cls1 = new Class1(34);
		Class2 cls2 = new Class2(11);
		System.out.println(cls1.getNum());
		cls2.showAllNum();
	}
}
