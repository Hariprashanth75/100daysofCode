import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Day14SortUsingMethod {

	public static int largeArray(int arr1[])
	{
		int large = arr1[0];
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>large)
				large = arr1[i];
		}
		return large;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter the size of the array");	
	int n= sc.nextInt();
       int arr1[] = new int[n];
       System.out.println("Enter the array elements");
       for(int i=0;i<arr1.length;i++)
       {
    	   arr1[i] = sc.nextInt();
       }
       int large= largeArray(arr1);
       System.out.println("The largest element in the array is:"+large);
	}

}
