import java.util.ArrayList;
import java.util.Scanner;
public class Day8ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> autos= new ArrayList<String>();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		n = sc.nextInt();
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			String element;
			element = sc.next();
			autos.add(element);		
		}
		for(int j=0;j<autos.size();j++)
		{
		System.out.println(autos.get(j));
		}
		
		System.out.println(autos);
		sc.close();

	}

}
