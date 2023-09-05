package Day65Polymorphism;

public class DateService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate party = new MyDate(4, 15, 2000);
		MyDate tax = new MyDate(4, 15, 2000);
		System.out.println(party);
		System.out.println(tax);
		System.out.println(party.hashCode());
		System.out.println(tax.hashCode());
		if(party == tax)
		{
			System.out.println("These point to same object");
		}
		
		//correct way to compare objects
		if(party.equals(tax))
		{
			System.out.println("The objects have same day month and year");
		}
		

	}

}
