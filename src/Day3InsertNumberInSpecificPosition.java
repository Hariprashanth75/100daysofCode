import java.util.Scanner;
public class Day3InsertNumberInSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n;
		int num,pos;
		n= sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be appended");
		num = sc.nextInt();
		System.out.println("Enter the location where you need to append");
		pos=sc.nextInt();
		arr1[pos]=num;
		System.out.println("The new array is:");
		for(int j=0;j<arr1.length;j++)
		{
			System.out.println(arr1[j]);
		}

	}

}
