package Day65Polymorphism;

import java.util.Objects;

public class MyDate {
	
	private int day, month, year;
	
	public MyDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Object o)
	{
		boolean result = false;
		if(o instanceof MyDate)
		{
			MyDate temp = (MyDate) o;
			result = (temp.day == day) && (temp.month==month) && (temp.year==year);
		}
		return result;
		
	}
	
	public int hashCode()
	{
		return Objects.hash(day,month,year);
	}
	
	public String toString()
	{
		return "Day: " +day+ " Month: " + month + " Year "+ year;
	
	}

}
