interface DisplayNum {
	public void show();
}

public class LambdaDemo3 {
	public static void main(String args[]) {
		int num=45;
		DisplayNum dNum = ()->{System.out.println("This number is "+num);};
		dNum.show();
	}
}
