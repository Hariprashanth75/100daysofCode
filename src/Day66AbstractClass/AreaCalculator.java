package Day66AbstractClass;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractShape sq = new Square(100);
		AbstractShape rc = new Rectangle(10,20);
		
		
		
		System.out.println("Area of square :"+sq.area());
		System.out.println("Area of rectangle :"+rc.area());
		

	}

}
