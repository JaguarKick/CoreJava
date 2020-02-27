public class LambdaDemo1 {
	interface Area {
		int calc(int a);
	}

	public int calculate(int a, Area ar) {
		return ar.calc(a);
	}

	public static void main(String args[]) {
		LambdaDemo1 ld1 = new LambdaDemo1();
		Area square = (int a) -> a+a;
		Area cube = (a) -> a * a * a;
		Area increment = a -> a + 1;
		
		System.out.println("Area of Square   : " + ld1.calculate(4,square));
		System.out.println("Area of cube     : " + ld1.calculate(8,cube));
		System.out.println("Increments	     : " + ld1.calculate(6,increment)); 
	}
}
