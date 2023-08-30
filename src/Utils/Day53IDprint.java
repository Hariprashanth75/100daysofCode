package Utils;

public class Day53IDprint {
String name;
String country;
String address;
static int fee=100;
static int ID=0;

public void Day53IDprint()
{
	ID = ID+1;
	
}
public void setFee(int feeAmt)
{
	fee=feeAmt;
}

public Day53IDprint(String name, String country, String address)
{
	this.name = name;
	this.country = country;
	this.address = address;
	this.Day53IDprint();
	
	
}

public String toString()
{
	return "NAME: " +name+ "Country: "+country+"Address: "+address + "ID: "+ID;
	
}


	
	
}
