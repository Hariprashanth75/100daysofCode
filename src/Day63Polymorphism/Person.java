package Day63Polymorphism;

public class Person {
	
	String firstname = "Charumathi";
	String lastname = "Mohan";
	
	public String getDescription()
	{
		System.out.println("In person class");
		return "First name: "+ firstname + " Last name: "+lastname;
	}

}
