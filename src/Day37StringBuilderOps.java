import java.util.concurrent.*;
import java.util.*;
public class Day37StringBuilderOps {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Notice the exception handling in main method
		StringBuilder str = new StringBuilder();
		str.append("Hari");
		System.out.println("The original string--->"+str.toString());
		System.out.println("The reverse of string-->"+str.reverse()); //String reverse
		System.out.println("The element in index 3-->"+str.charAt(3));
		
		StringBuilder str1 = new StringBuilder();
		str1.append("Hari "); str1.append("is a "); str1.append("good boy");
		System.out.println("The whole string==>"+str1.toString());
		str1.insert(8, "not ");
		System.out.println("The modified string==>"+str1.toString());
		
		

	}

}
