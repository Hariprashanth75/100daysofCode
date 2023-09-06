package Day85ExceptionHandling;

public class RevisitTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			String text = "This is a good day";
			System.out.println(text.charAt(30)); //No index at 30
			
			
		}
		catch(Exception e)
		{
			System.out.println("Hello you have following exception: "+e);
		}
		
		try
		{
			String text1 = "This is a good day Amigo";
			System.out.println(text1.charAt(30));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Hello your string is not that big!!!");
			
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
		
		finally {
			System.out.println("This is the final portion that is executed in the end");
		}

	}

}
