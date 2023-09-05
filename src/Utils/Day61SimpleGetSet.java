package Utils;

public class Day61SimpleGetSet {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day61GettersSetters gs = new Day61GettersSetters();
		
		double currentTax = gs.getTax();
		System.out.println(currentTax);
		
		double setTax = 0.9;
		gs.setTax(setTax);
		currentTax = gs.getTax();
		System.out.println(currentTax);
		
		

	}

}
