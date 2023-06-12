import java.util.Scanner;
import java.util.regex.*;
public class Day20PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Password must contain... "
				+ "\n 1. More than 8 characters"
				+ "\n 2. Must contain both upper case and lower case characters"
				+ "\n 3. Must contain atleast one number"
				+ "\n 4. Atleast one special character");
		System.out.println("Enter the password::::");
		String password = sc.nextLine();
		boolean ans = isValidPassword(password);
		if(ans)
		{
		System.out.println("The password is valid");
		}
		else
		{
			System.out.println("The passoword is invalid");
		}
		

	}
	public static boolean isValidPassword(String password)
	{
		final int LENGTH=8;
		if(password.length()< LENGTH) return false;
		
		int charUpCount =0;
		int charLowCount=0;
		int intCount =0;
		int special =0;
		
		
		for(int i=0;i<password.length();i++)
		{
			char ch = password.charAt(i);
			
			if(isNumeric(ch)) intCount++;
			else if(isCharacterUpper(ch)) charUpCount=charUpCount+1;
			else if(isCharacterLower(ch)) charLowCount=charLowCount+1;
			else if(isSpecial(ch)) special=special+1;
			else return false;
		}
		return ( intCount > 0 && charUpCount > 0 && charLowCount >0 && special >0);
		
		
		
	}
	
	public static boolean isNumeric(char ch)
	{
		return (ch > '0' && ch < '9');
	}
	
	public static boolean isCharacterUpper(char ch)
	{
		return Character.isUpperCase(ch);
	}
	
	public static boolean isCharacterLower(char ch)
	{
		return Character.isLowerCase(ch);
	}
	
	public static boolean isSpecial(char ch)
	{
		
		return (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch));
		
	}

}
