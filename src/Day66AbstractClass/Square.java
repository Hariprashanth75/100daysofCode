package Day66AbstractClass;

public class Square extends AbstractShape {
	
	private double side;
	Square(double side)
	{
		this.side = side;
	}

	@Override
	double area() {
		return side * side;
		// TODO Auto-generated method stub
		
		
	}
	

}
