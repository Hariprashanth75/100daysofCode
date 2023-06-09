import java.util.Scanner;

public class Day18FutureInvestmentUsingMethod {

	public static double futureInvestment(double investedAmount, double rate, int year)
	{
		return investedAmount * Math.pow(1+rate, year*12);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		double p = sc.nextDouble();
		System.out.println("Enter the number of years");
		int n = sc.nextInt();
		System.out.println("Enter the rate of interest");
		double r = sc.nextDouble();
		
		r = r*0.01;
		int formatter =19;
		System.out.println("Years    FutureValue");
		for(int i=1;i<=n;i++)
		{
			if(i>=10) formatter=18;
			System.out.printf(i + "%" +formatter+ ".2f\n", futureInvestment(p,r/12,i));
		}

	}

}
