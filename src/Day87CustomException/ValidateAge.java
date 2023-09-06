package Day87CustomException;

public class ValidateAge {
	
	static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("The age is lesser than 18, Sorry!");
		}
		else
		{
			System.out.println("Welcome! you can vote now");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			validate(2);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Custom exception caught!" + e);
		}

	}

}
