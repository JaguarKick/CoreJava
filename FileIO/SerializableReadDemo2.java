import java.io.*;

public class SerializableReadDemo2{
	public static void main(String args[]){
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Employee emp = null;
		try{
			fis = new FileInputStream(args[0]);
			ois = new ObjectInputStream(fis);
			emp = (Employee)ois.readObject();
			System.out.println("Employee name		: " + emp.getEmployeeName());
			System.out.println("Employee Code		: " + emp.getEmployeeId());
			System.out.println("Employee Designation	: " + emp.getProfile().getDesignation());
			System.out.println("Salary per annum		: " + emp.getProfile().getSalary());
			ois.close();
		}catch(IOException ioe){
			System.out.println("Failed to read."+ioe);
		}catch(ClassNotFoundException cnf){
			System.out.println(cnf);
		}catch(ClassCastException ccf){
			System.out.println(ccf);
		}catch(NullPointerException e){
			System.out.print("Null");
		}
	}
}
