package Day94TailRecursion;

import java.util.Scanner;

public class TailRecursion {

	public static void print(int times, String name) {
		if (times <= 0) {
			System.out.println("End of recursion");
		} else {
			System.out.println("This is " + times + " recursion to print " + name);
			print(--times, name);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the number of times you want to display it: ");
		int times = sc.nextInt();
		print(times, name);
		

	}

}
