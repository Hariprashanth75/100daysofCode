package Day64Polymorphism;

public class PayService {
	
	public void cutCheck(Employee e)
	{
		double gross = e.getPay();
		System.out.println("Pay: " + gross);
	}

}
