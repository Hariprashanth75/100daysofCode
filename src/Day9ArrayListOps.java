import java.util.ArrayList;
import java.util.Scanner;
public class Day9ArrayListOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int num;
		
		for(int i=0;i<n;i++) {
			num = sc.nextInt();
			numbers.add(num);
		}
		
		for(int j=0;j<n;j++) {
			
			numbers.get(j);
		}
		System.out.println("If you want to change any element please specify position and value");
		int pos, value;
		System.out.println("Position:");
		pos= sc.nextInt();
		System.out.println("Value:");
		value = sc.nextInt();
		numbers.set(pos, value);
		System.out.println(numbers);
		
		System.out.println("If you want to remove element please specify position");
		int rempos;
		rempos=sc.nextInt();
		numbers.remove(rempos);
		System.out.println(numbers);

	}

}
