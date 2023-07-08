import java.util.concurrent.*;
import java.util.*;
public class Day36StringBuilderInitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("Hari");
		System.out.println("String builder string--"+str.toString());
		System.out.println("Capacity of string--"+str.capacity());
		//Initialize the string builder constructor using object
		StringBuilder str1= new StringBuilder(10);
		str1.append("AAAABBCCCC");
		System.out.println("String builder string--"+str1.toString());
		System.out.println("Capacity of string--"+str1.capacity());
		//Intialize the stringbuilder constructor using stringbuilder object
		StringBuilder str2 = new StringBuilder(str1.toString());
		System.out.println("String builder string--"+str2.toString());
		System.out.println("Capacity of string--"+str2.capacity());
		
	

	}

}
