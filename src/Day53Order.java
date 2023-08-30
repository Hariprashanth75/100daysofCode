import Domain.Day52MyDate;

public class Day53Order {
Day52MyDate orderDate;
double orderAmount= 0.00;
String customer;
String product;
int quantity;

static double taxRate=0.05;

public static void setTaxRate(double newRate)
{
	taxRate = newRate;
}

public static void computeTaxOn(double anAmount)
{
	System.out.println("The tax amount "+anAmount+"is "+Day53Order.taxRate);
}

public Day53Order(Day52MyDate d, double amt, String c, String p, int q)
{
	orderDate = d;
	orderAmount = amt;
	customer = c;
	product = p;
	quantity =q;
	
}

public String toString()
{
	return quantity + "ea." + " for " + customer;
}


public double computerTax()
{
	System.out.println("The tax for this order is:" + orderAmount * Day53Order.taxRate);
	return orderAmount * Day53Order.taxRate;
}
}
