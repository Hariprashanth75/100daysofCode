package Day1ArrayAddition;
import java.io.*;


public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int arr1[] = {2,4,6,8,10};
			int arr2[] = {1,3,5,7,9};
			int arr3[] = new int[arr1.length];
			
			for(int i=0;i<arr1.length;i++)
			{
			    arr3[i]=arr1[i]+arr2[i];
			    System.out.println(arr3[i]);
			}

}
}

