class Bird
{
	

	public void walk()
	{
		System.out.println("The bird walks");
	}

}

class Seagull extends Bird
{
	public void swim()
	{
		System.out.println("The seagull can swim");
	}
}

class Crow extends Bird
{
	public void fly()
	{
		System.out.println("The crow can fly");
	}
}
public class Day35InheritanceOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Seagull sea = new Seagull();
		Crow crow = new Crow();
		sea.swim();
		sea.walk();
		crow.fly();
		crow.walk();

	}

}
