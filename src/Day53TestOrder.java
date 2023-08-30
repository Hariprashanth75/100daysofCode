import Domain.Day52MyDate;

public class Day53TestOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day52MyDate date1 = new Day52MyDate(1,20,2023);
		Day53Order anvil = new Day53Order(date1, 1000.00, "Bugs bunny", "Wild Coyote", 10);
		
		Day52MyDate date2 = new Day52MyDate(1,22,2023);
		Day53Order balloons = new Day53Order(date2, 2000.0, "Silver hawk", "Wild boar", 20);
		System.out.println(anvil);
		System.out.println(balloons);
		System.out.println("The tax is currently :"+ Day53Order.taxRate);
		
		Day53Order.computeTaxOn(3000);
		anvil.computerTax();
		balloons.computerTax();
		
		Day53Order.setTaxRate(0.08);
		System.out.println("The tax is currently :"+ Day53Order.taxRate);
		Day53Order.computeTaxOn(3000);
		anvil.computerTax();
		balloons.computerTax();
		

	}

}
