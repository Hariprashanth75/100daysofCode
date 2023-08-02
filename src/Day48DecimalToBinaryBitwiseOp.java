import java.util.Scanner;


class decToBinary
{
	public void decToBinaryBitwise(int n)
	{
		for(int i=31;i>=0;i--)
		{
			int k= n>>i;
			if((k&1)>0)
			{
				System.out.println("0");
			}
			else
			{
				System.out.println("1");
			}
		}
	}
}
public class Day48DecimalToBinaryBitwiseOp {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int num = sc.nextInt();
		decToBinary dc = new decToBinary();
		System.out.println("The binary form is");
		dc.decToBinaryBitwise(num);

	}

}
