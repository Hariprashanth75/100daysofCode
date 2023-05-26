import java.util.Scanner;
public class Day2ArraySecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("The second largest number in the array is");
		int firstLarge=arr1[0];
		int secondLarge = 0;
		
		for(int j=0;j<arr1.length;j++)
		{
			if(arr1[j]>firstLarge)
			{
				secondLarge=firstLarge;
				firstLarge = arr1[j];
				
			}
		}
		System.out.println("The second largest number in the array is" + secondLarge);

	}

}
