import java.util.*;
interface stringConcat
{
	public String stringConcatination(String s1, String s2);
}
public class Day41LambdaExpString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringConcat s = (str1, str2)->str1+str2;
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2=  sc.nextLine();
		System.out.println("The concatination of two strings =>"+s.stringConcatination(s1, s2));
		
		
		
		
		
		

	}

}
