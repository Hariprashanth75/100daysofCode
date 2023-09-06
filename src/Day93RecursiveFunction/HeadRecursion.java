package Day93RecursiveFunction;

import java.util.Scanner;

public class HeadRecursion {
	
	public static int sum(int n)
	{
		if(n > 0)
		{
			return n + sum(n-1);
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		System.out.println("The sum of numbers");
		int result = sum(num);
		System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}

	}

}
