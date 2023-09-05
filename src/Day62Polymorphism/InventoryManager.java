package Day62Polymorphism;

public class InventoryManager {
	
	private Automobile featuredAuto;
	//FRAME
	//Automobile auto = new Car()
	public void addFeaturedAuto(Automobile auto)
	{
		featuredAuto = auto;
	}
	
	public void addAutomobile(Automobile a)
	{
		System.out.println("Adding automobile: #"+a.getVIN());
	}

}
