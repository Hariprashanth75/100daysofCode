package Day62Polymorphism;

public class Automobile {
	
	private static int vinCount = 122_123_756;
	private int VIN;
	
	public int getVIN()
	{
		return VIN;
	}
	
	public Automobile() {
		VIN = vinCount++;
		
	}
	
	

}
