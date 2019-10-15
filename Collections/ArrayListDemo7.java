import java.io.*;
import java.util.*;

class Student implements Serializable{
	private int rollNo;
	private String name;
	
	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

}


public class ArrayListDemo7 {
	
	private static void writeList(ArrayList list) throws Exception {
		FileOutputStream fos = new FileOutputStream("Student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		fos.close();
	}
	
	private static ArrayList readList() throws Exception {
		FileInputStream fis = new FileInputStream("Student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList list = (ArrayList)ois.readObject();
		ois.close();
		fis.close();
		return list;
	}

	public static void main(String args[]) throws Exception {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"Amanda"));
		list.add(new Student(2,"James"));
		list.add(new Student(3,"Rhonda"));
		list.add(new Student(4,"Brian"));
		list.add(new Student(5,"William"));
		list.add(new Student(6,"Sam"));
		writeList(list);
		System.out.println(list.size() + " elements written to Student.dat. Clearing the list now.");
		list.clear();
		System.out.println("List has been cleared. Reading the list from Student.dat");
		list = readList();
		for(Student s:list) {
			System.out.println(s.getRollNo() + " \t " + s.getName());
		}
	}
}
