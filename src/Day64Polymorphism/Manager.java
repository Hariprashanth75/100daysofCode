package Day64Polymorphism;

public class Manager extends Employee{
	
	
	private double salary = 150_000;
	private double bonus = 7500;
	
	

	public double getPay() {
		System.out.println("Manager pay:");
		return (salary/24) * (bonus/24);

	}

}
