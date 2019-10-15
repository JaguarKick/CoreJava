import java.util.*;

class Student {
	private String name;
	private int rollNo;
	
	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
		
	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}
};


public class ArrayListDemo6 {
	public static void main(String args[]) {
		Student st1 = new Student("James",1);
		Student st2 = new Student("Mike",2);
		Student st3 = new Student("Walter",3);
		Student st4 = new Student("Jessie",4);
		Student st5 = new Student("Saul",5);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		//Iterator itr = list.iterator();
		for(Student s:list) {
			System.out.println(s.getName() + " : " + s.getRollNo());
		}
	}
}
