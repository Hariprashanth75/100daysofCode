import java.io.*;
import java.util.Scanner;
public class Day11Palindrome {

	public static boolean isBoolean(String str)
	{
	String rev ="";
	boolean answer = false;
	for(int i=str.length()-1;i>=0;i--)
	{
		rev = rev + str.charAt(i);
	}
	if(str.equals(rev))
	{
		answer = true;
	}
	return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter a string/name/word");
		str = sc.nextLine();
		boolean ans= isBoolean(str);
		System.out.println(ans);
		

	}

}
