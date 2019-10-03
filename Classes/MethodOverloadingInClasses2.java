class AbcV1{
	public void info(){
		System.out.println("Simple info");
	}
}

class AbcV2 extends AbcV1{
	public void info(String s){
		System.out.println("String.");
	}
}

class AbcV3 extends AbcV2{
	public void info(int n){
		System.out.println("Integer.");
	}
}

public class MethodOverloadingInClasses2{
	public static void main(String args[]){
		AbcV3 abc = new AbcV3();
		abc.info();
		abc.info("Str");
		abc.info(1);
	}
}
