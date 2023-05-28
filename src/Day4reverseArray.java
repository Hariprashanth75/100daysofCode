import java.util.Scanner;
public class Day4reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n;
		n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[arr1.length];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("The reverse of the array");
		for(int j=0; j<arr1.length;j++)
		{
			n=n-1;
			arr2[j]=arr1[n];
			System.out.println(arr2[j]);
		}

	}

}
