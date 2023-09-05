package Day66AbstractClass;

public class Rectangle extends AbstractShape {
	private double width;
	private double height;
	
	Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

}
