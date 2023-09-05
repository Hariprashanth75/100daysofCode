package Day62Polymorphism;

public class CarDealership {
	
	private static InventoryManager manager = new InventoryManager();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		manager.addAutomobile(c);
		
		Truck t = new Truck();
		manager.addAutomobile(t);
		
		Motorcycle m = new Motorcycle();
		manager.addAutomobile(m);
		//Look below method
		manager.addFeaturedAuto(new Car());
		

	}

}
