import java.util.Scanner;
public class Day23FactorsOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number (positive or negative)");
		int num = sc.nextInt();
		factor(num);
		

	}
	
	public static void factor(int num)
	{
		int number;
		number = num;
		System.out.println(number+"=");
		while(number % 3==0)
		{
			System.out.println("3 *");
			number = number/3;
		}
		System.out.println(number);
	}

}
