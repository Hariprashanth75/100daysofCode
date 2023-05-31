import java.util.Scanner;
import java.util.Arrays;
public class Day6ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]= sc.nextInt();
		}
		
		Arrays.sort(arr1);
		System.out.print("The array is sorted");
		
		int j=0;
		int len=arr1.length;
		for(int a=0;a<len-1;a++)
		{
			if(arr1[a]!=arr1[a+1])
			{
				arr1[j++]=arr1[a];
			}
			
		}
		arr1[j++]=arr1[len-1];
		System.out.print("After removing duplicates");
		for(int b=0;b<j;b++)
		{
			System.out.println(arr1[b]);
		}
	}

}
