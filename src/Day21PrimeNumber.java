import java.util.Scanner;
public class Day21PrimeNumber {

	public static boolean isPrime(int num)
	{
		boolean flag= true;
		for(int i=2;i<num/2;++i)
		{
			if(num%i==0) flag = false;
			
		}
		return flag;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(isPrime(num))
			System.out.println("The number is prime number");
		else
			System.out.println("The number is not prime number");

	}

}
