import java.util.Scanner;

public class Day22AreaOfTriangle {

	public static boolean isTriangle(double a, double b, double c)
	{
		boolean flag=false;
		if((a+b)>c && (b+c)>a &&(a+c)>b) flag= true;
		
		return flag;
	}
	
	public static double areaTriangle(double a, double b, double c)
	{
		double s= (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 sides of triangle");
		System.out.println("a:"); double a = sc.nextInt();
		System.out.println("b:"); double b = sc.nextInt();
		System.out.println("c:"); double c = sc.nextInt();
		
		if(isTriangle(a,b,c))
		{
		System.out.println("The traingle is valid and the area of triangle is:"+areaTriangle(a,b,c));
		}
		else
		{
			System.out.println("The triangle dimensions are not valid");
		}
	}

}
