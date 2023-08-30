package Domain;

public class Day52MyDate {
	
	public int day;
	public int year;
	public int month;
	
	public Day52MyDate() {}
	
	public Day52MyDate(int m, int d, int y)
	{
		setDate(m,d,y);
		
	}
	
	public String toString()
	{
		return "D:"+day+"M:"+month+"Y:"+year;
	}
	
	public void setDate(int m, int d, int y)
	{
		day=d;
		month=m;
		year=y;
	}

	

}
