class OrderedClass {
	static int num;
	
	int a = clarify("Assigning A");
	{
		clarify("Initializer 1");
	}

	int b = clarify("Assigning B");
	{
		clarify("Initializer 2");
	}

	int c = clarify("Assigning C");
	{
		clarify("Initializer 3");
	}

	OrderedClass() {
		clarify("Constructor");
	}

	int d = clarify("Assigning d");
	{
		clarify("Initializer 4");
	}

	int clarify(String message) {
		num++;
		System.out.println(num + " " + message);
		return num;
	}
}


public class InitializersDemo {
	public static void main(String args[]){
		new OrderedClass();
	}
}
