package Utils;

public class Day52IDprint {
String name;
String country;
String address;
static int fee=100;
static int ID=1;

public void setFee(int feeAmt)
{
	fee=feeAmt;
}

public Day52IDprint(String name, String country, String address)
{
	this.name = name;
	this.country = country;
	this.address = address;
	ID++;
	
}

public String toString()
{
	return "NAME: " +name;
}


	
	
}
