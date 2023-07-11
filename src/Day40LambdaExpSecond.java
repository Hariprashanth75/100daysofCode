import java.util.Scanner;

interface SimpleInterest
{
	public float si(float a, float b, float c);
}
public class Day40LambdaExpSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInterest s=(p,n,r)->p*n*r/100;
		
		System.out.println("The simple interest calculation result="+s.si(1000, 5, 4));
		
		

	}

}
