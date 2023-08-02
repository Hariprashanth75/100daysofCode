
public class Day47ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =32;
		int rshift = number>>2;
		System.out.println(rshift);
		int lshift = number<<2;
		System.out.println(lshift);
		int unsignedRshift=number>>>2;
		System.out.println(unsignedRshift);
		
		System.out.println("In a loop");
		for(int i=31;i>=0;i--)
		{
			int k= number>>i;
			System.out.println(k);
		}
		

	}

}
