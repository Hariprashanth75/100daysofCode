package Day64Polymorphism;

public class Lead extends Employee {
	

	private double perProject = 1_000;
	private int projects = 2;
	
	

	public double getPay() {
		System.out.println("Lead pay:");
		return perProject * projects;

	}
}
