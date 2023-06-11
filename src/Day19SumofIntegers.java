import java.util.Scanner;
public class Day19SumofIntegers {

	public static int sumofInt(int num)
	{
		int sum=0;
		while(num!=0)
		{
			
			sum = sum +num%10;
			
			num = num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the number");
		int num= sc.nextInt();
		int sum = sumofInt(num);
		System.out.println("The sum of the integers is"+sum);
		

	}

}
