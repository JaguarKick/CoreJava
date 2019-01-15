class Student{
	private int rollNo;
	private String name;

	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}

	public int getRollNo(){
		return rollNo;
	}

	public String getName(){
		return name;
	}
}

public class ThisDemo{
	public static void main(String args[]){
		Student stud = new Student("Sam",45);
		System.out.println(stud.getName());
		System.out.println(stud.getRollNo());
	}
}
