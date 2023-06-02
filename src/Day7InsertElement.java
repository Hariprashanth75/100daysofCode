import java.util.Scanner;

public class Day7InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int num,pos;
		System.out.println("Enter the size of the array");
		n= sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]= sc.nextInt();
		}
		System.out.println("Enter the number you want to insert");
		num = sc.nextInt();
		System.out.println("Enter the position you want to insert");
		pos = sc.nextInt();
		insertElement(num,pos,arr1);
		
		

	}
	
	public static void insertElement(int num, int pos, int[] arr1)
	{
		arr1[pos]=num;
		for(int a=0;a<arr1.length;a++)
		{
			System.out.println(arr1[a]);
		}
	}

}
