interface PrintName {
	public String sayMyName(String name);
}

public class LambdaDemo5 {
	public static void main(String args[]) {
		PrintName pN1 = (name)-> { return "Hello "+name;};
		System.out.println(pN1.sayMyName("Sam"));

		PrintName pN2 = name-> { return "Hello "+name;};
		System.out.println(pN2.sayMyName("Rhonda"));
	}
}

