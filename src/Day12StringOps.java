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
		System.out.println("Concatination with operands:"+s4);
		System.out.println("With concat operator"+s3);

	}

}
