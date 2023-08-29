
public class Day52MyDate {
	
	int day;
	int year;
	int month;
	
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
