import java.util.*;
public class Day44CallbyRefEx3 {

	static void updateArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]+1;
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the "+i+" Number");
			a[i]=sc.nextInt();
			
		}
		
		updateArray(a);

	}

}
