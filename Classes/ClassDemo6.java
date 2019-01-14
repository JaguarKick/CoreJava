class Abc{
	private int amount = 20000;
	private float rate = 6.7f;
	private int time = 5;
	
	public int getAmount(){
		return amount;
	}
	
	public float getRate(){
		return rate;
	}
	
	public int getTime(){
		return time;
	}
}

class Interest{
	private double interest;
	private Abc abc = new Abc();
	
	public double getInterest(){
		interest = (abc.getAmount() * abc.getRate() * abc.getTime()) / 100;
		return interest;
	}
	
	public double getTotal(){
		return abc.getAmount() + interest;
	}
}

public class ClassDemo6{
	public static void main(String args[]){
		Abc abc = new Abc();
		Interest intr = new Interest();
		
		System.out.println("Amount 		: " + abc.getAmount());
		System.out.println("Rate of interest	: " + abc.getRate());
		System.out.println("Duration		: " + abc.getTime());
		System.out.println("Interest Payable	: " + intr.getInterest());
		System.out.println("Total Amount	: " + intr.getTotal());
	}
}
