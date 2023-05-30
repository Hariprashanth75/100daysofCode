import java.util.Scanner;
public class Day5AddArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n= sc.nextInt();
		System.out.println("Enter the array elements");
		int arr1[] = new int[n];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
			sum = sum +arr1[i];
		}
		System.out.println("The sum of array elements"+sum);
	}

}
