import java.util.Scanner;
import java.io.*;

class Swapper
{
	int a;
	int b;
	
	void Swapper(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	static void SwapFunc(Swapper s) {
		int temp;
		temp=s.a;
		s.a=s.b;
		s.b=temp;
		System.out.println("The value of a after swap is: "+s.a);
		System.out.println("The value of b after swap is: "+s.b);
		return;
	}
}

public class Day43CallbyRefEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the first number: ");
		a=sc.nextInt();
		System.out.println("Enter the second number: ");
		b=sc.nextInt();
		Swapper sp = new Swapper();
		sp.Swapper(a,b);
		sp.SwapFunc(sp);
		
		
				

	}

}
