import java.io.*;

class Student implements Serializable{
	private String name;
	private int rollNo;
	
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	public String getName(){
		return name;
	}

	public int getRollNo(){
		return rollNo;
	}
}

public class SerializableWriteDemo{
	public static void main(String args[]){
		Student stud = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try{
			stud = new Student(args[0],Integer.parseInt(args[1]));
			fos = new FileOutputStream(args[0]);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(stud);
			oos.close();
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println("Missing parameter");
		}catch(NumberFormatException nfe){
			System.out.println(nfe);
		}catch(IOException ioe){
			System.out.println(ioe);
		}
	}
}

