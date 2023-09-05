package Day64Polymorphism;


public class Developer extends Employee {
	
	

	private int linesOfCode = 1_000;
	private double perLineOfCode = 3.00;
	
	
	
	public double getPay()
	{
		System.out.println("Developer pay:");
		return linesOfCode * linesOfCode;
	}

}
