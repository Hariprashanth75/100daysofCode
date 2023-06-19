import java.util.*;
import java.io.*;


public class Day26LinkedListOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cars you want to add");
		int n = sc.nextInt();
		LinkedList<String> cars = new LinkedList<String>();
		
		System.out.println("Now enter the car names");
		for(int i=0;i<n;i++)
		{
			String carName = sc.next();
			cars.add(carName);
		}
		System.out.println("The elements of the linked list"+cars);
		System.out.println(cars.get(1));

	
		

	}

}
