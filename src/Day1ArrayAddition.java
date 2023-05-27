import java.io.*;
import java.util.Scanner;
public class Day1ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Enter the size of the array");
		n= sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int arr3[] = new int[n];
		
		System.out.println("Enter the 1st array elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the 2nd array elements");
		for(int j=0;j<arr1.length;j++)
		{
			arr2[j] = sc.nextInt();
		}
		
		System.out.println("Sum of two arrays");
		for(int k=0; k<arr1.length;k++)
		{
			arr3[k]=arr1[k]+arr2[k];
			System.out.println(arr3[k]);
		}

	}

}
