import java.util.Scanner;
public class Day17SimpleInterestUsingMethod {

	public static int rateOfInterest(int p, int n, int r)
	{
		int si=(p*n*r)/100;
		return si;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		int p = sc.nextInt();
		System.out.println("Enter the number of years");
		int n = sc.nextInt();
		System.out.println("Enter the rate of interest");
		int r=sc.nextInt();
		int interest = rateOfInterest(p,n,r);
		System.out.println("The simple interest"+interest);
		

	}

}
