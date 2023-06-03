import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Day10ArrayListOps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> numbers = new ArrayList<Integer>();
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the array size");
     int n = sc.nextInt();
     System.out.println("Enter the arraylist elements");
     
     int num;
     for(int i=0;i<n;i++)
     {
    	 num = sc.nextInt();
    	 numbers.add(num);
     }
     
     Collections.sort(numbers);
     System.out.println(numbers);

	}

}
