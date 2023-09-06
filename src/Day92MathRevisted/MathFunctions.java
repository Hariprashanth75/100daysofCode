package Day92MathRevisted;

public class MathFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double value1 = 50;
		double value2 = 45;
		double value3= 145.90;
		
		System.out.println(Math.max(value1, value2));
		System.out.println(Math.min(value1, value2));
		System.out.println(Math.round(value3));
		System.out.println(Math.round(Math.sqrt(value3)));
		System.out.println(Math.random());
		System.out.println(Math.abs(value3));
		
		//Generate a radom number between 0-50
		int random = (int)(Math.random()*51);
		System.out.println(random);

	}

}
