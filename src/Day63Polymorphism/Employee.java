package Day63Polymorphism;

public class Employee extends Person{
	
	String title = "Mrs.";
	
	public String getDescription()
	{
		System.out.println("In Employee");
		return super.getDescription() + " title: " + title;
		
	}

}
