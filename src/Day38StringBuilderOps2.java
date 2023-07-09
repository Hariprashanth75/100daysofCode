import java.util.concurrent.*;
public class Day38StringBuilderOps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("Hari");
		//Simple location of character
		try
		{
		//System.out.println("The character in 1st place \n"+str.charAt(str.length()));
			System.out.println("The character in 1st place \n"+str.charAt(1));
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
		
		
		//Use a loop to iterate
		for(int i=0;i<str.length();i++)
		{
			System.out.println("The character at "+i+" is :"+str.charAt(i));
		}

	}

}
