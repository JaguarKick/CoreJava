import java.io.*;

public class SerializableReadDemo{
	public static void main(String args[]){
		Student stud = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try{
			fis = new FileInputStream(args[0]);
			ois = new ObjectInputStream(fis);
			stud = (Student)ois.readObject();
			ois.close();
			System.out.println("Student Name 	: " + stud.getName());
			System.out.println("Roll No		: " + stud.getRollNo());
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println("Missing parameter.");
		}catch(ClassCastException cce){
			System.out.println(cce);
		}catch(IOException ioe){
			System.out.println(ioe);
		}catch(ClassNotFoundException cnf){
			System.out.println(cnf);
		}
	}
}
