import java.io.*;

class Employee implements Serializable{
	private String empName;
	private int empCode;
	private transient Profile currentProfile;

	Employee(String empName, int empCode, Profile currentProfile){
		this.empName = empName;
		this.empCode = empCode;
		this.currentProfile = currentProfile;
	}

	public String getEmployeeName(){
		return empName;
	}

	public int getEmployeeId(){
		return empCode;
	}

	public Profile getProfile(){
		return currentProfile;
	}
}

class Profile{
	private String designation;
	private int salary;

	Profile(String designation, int salary){
		this.designation = designation;
		this.salary = salary;
	}

	public String getDesignation(){
		return designation;
	}

	public int getSalary(){
		return salary;
	}
}


public class SerializableWriteDemo2{
	public static void main(String args[]){
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		Employee emp = null;
		try{
			emp = new Employee(args[0],Integer.parseInt(args[1]), new Profile(args[2],Integer.parseInt(args[3])));
			fos = new FileOutputStream(args[0]);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println("Parameter missing."+aio);
		}catch(NumberFormatException nfe){
			System.out.println("Numeric input required."+nfe);
		}catch(IOException ioe){
			System.out.println("Failed to write."+ioe);
		}
	}
}
