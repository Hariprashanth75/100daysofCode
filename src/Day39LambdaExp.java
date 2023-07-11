interface Function
{
	void abstractFunc(int x, int y);
}
public class Day39LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function fun = (int x, int y)->System.out.println("X multipled by 2="+2*x+"\nY multiplied by 5="+5*y);
		
		fun.abstractFunc(2, 5);

	}

}
