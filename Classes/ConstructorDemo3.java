class Student{
	private int rollNo;
	private String name;

	Student(int rn, String sn){
		rollNo = rn;
		name = sn;
	}
	
	public int getRollNo(){
		return rollNo;
	}
	
	public String getName(){
		return name;
	}
}

public class ConstructorDemo3{
	public static void main(String args[]){
		Student stud = new Student(45,"Sam Paul");
		System.out.println("Name		: " + stud.getName());
		System.out.println("Roll No		: " + stud.getRollNo());
	}
}
