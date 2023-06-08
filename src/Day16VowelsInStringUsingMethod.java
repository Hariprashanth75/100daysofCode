import java.util.Scanner;
public class Day16VowelsInStringUsingMethod {

	public static void countVowels(String arr1)
	{
		char[] name = arr1.toCharArray();
		String vowels=" ";
		int num=0;
		for(int i=0;i<arr1.length();i++)
		{
			if(name[i]=='a'||name[i]=='e'||name[i]=='i'||name[i]=='o'||name[i]=='u')
			{
				num=num+1;
				vowels = vowels + " "+name[i];
			}
				
		}
		System.out.println("There are "+num+"vowels in this string, They are "+vowels);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the string");
		String str = sc.nextLine();
        countVowels(str);
	}

}
