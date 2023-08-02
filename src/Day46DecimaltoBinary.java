import java.util.Scanner;

public class Day46DecimaltoBinary {
	static void decToBinary(int n)
	{
		int arr[] = new int[1000];
		int i=0;
		while(n>0)
		{
			arr[i]=n%2;
			n=n/2;
			i++;
		}
		System.out.println("The binary number of the value is");
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int num = sc.nextInt();
		decToBinary(num);

	}

}