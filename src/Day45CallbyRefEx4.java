import java.util.*;
import java.io.*;
public class Day45CallbyRefEx4 {

	static void updateArrayList(ArrayList<Integer> arr)
	{
		for(int i=0;i<arr.size();i++)
		{
			arr.set(i, arr.get(i)+1);
			
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
	   ArrayList<Integer> arr = new ArrayList<>();
	   
	   
	   
	   for(int i=0;i<5;i++)
	   {
		   System.out.println("Enter the" +i+ "number");
		   arr.add(sc.nextInt());
	   }
	   
	   updateArrayList(arr);
	   System.out.println("The updated list = "+arr);
	   

	}

}
