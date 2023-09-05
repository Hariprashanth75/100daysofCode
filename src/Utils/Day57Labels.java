package Utils;

public class Day57Labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java labels to break out from a loop
		outer_label:
		while(true)
		{
			int x=0;
			while(true)
			{
				if(x>=10)
					break outer_label;
				
				System.out.println(x++);
			}
		}

	}

}
