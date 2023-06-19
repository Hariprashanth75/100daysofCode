import java.util.HashMap;
import java.util.Scanner;
public class Day27HashmapIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> capital = new HashMap<String, String>();
		System.out.println("Enter the number of cities you would like to map");
		int n = sc.nextInt();
		System.out.println("Enter the cities and capital");
		
		for(int i=0;i<n;i++)
		{
			    System.out.println("Enter city");
				String city = sc.next();
				
				System.out.println("Enter State");
				String country = sc.next();
				
				capital.put(city,country);
			
		}
		System.out.println("Cities and captials"+capital);

	}

}
