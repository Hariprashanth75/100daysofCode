import java.io.*;
import java.util.Scanner;

class CallbyRef
{
	static void Swap(int a, int b)
	{
		int temp =a;
		a=b;
		b=temp;
		System.out.println("Value of a after swap: "+a);
		System.out.println("Value of b after swap: "+b);
		return;
	}
}

public class Day42CallbyReferenceEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter value of a: ");
		a=sc.nextInt();
		System.out.println("Enter value of b: ");
		b=sc.nextInt();
		CallbyRef r = new CallbyRef();
		r.Swap(a,b);
		
		
		

	}

}
