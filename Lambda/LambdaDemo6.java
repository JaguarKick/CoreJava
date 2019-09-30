interface Add {
	int add(int a,int b);
}

public class LambdaDemo6 {
	public static void main(String args[]) {
		Add add1 = (a,b)->(a+b);
		System.out.println(add1.add(45,66));
		Add add2 = (int x,int y)->(x+y);
	
		System.out.println(add2.add(33,33));
	}
}
