import java.util.Scanner;

public class Day12StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2,s3,s4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		s1= sc.nextLine();
		System.out.println("Enter string 2");
		s2=sc.nextLine();
		s3 = s1.concat(s2);
		s4= s1 + " " +s2;
		System.out.println("Concatination with operands:-"+s4);
		System.out.println("With concat operator:-"+s3);
		System.out.println("The length of s1:-"+s1.length()+" The length of s2:-"+s2.length());
		System.out.println("Length of fullname:-"+s4.length());
		
		System.out.println("To uppercase :-"+s4.toUpperCase());
		
		if(s1.contains("Hari")==true)
		{
			System.out.println("The string1 has the name Hari");
		}
		else
		{
			System.out.println("The string1 does not have Hari");
		}
		
		char[] charArray = s4.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			System.out.println(charArray[i]);	
		}
		

	}

}
