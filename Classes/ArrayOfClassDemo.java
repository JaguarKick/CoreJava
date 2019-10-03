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

public class ArrayOfClassDemo{
	public static void main(String args[]){
		Student stud[] = new Student[5];
		stud[0] = new Student("Sam",45);
		stud[1] = new Student("Mike",12);
		stud[2] = new Student("Rhonda",11);
		stud[3] = new Student("Luke",9);
		stud[4] = new Student("William",44);
		
		for(Student s:stud){
			System.out.println(s.getName());
			System.out.println(s.getRollNo());
		}
	}
}
