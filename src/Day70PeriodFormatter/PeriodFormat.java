package Day70PeriodFormatter;

import java.time.LocalDate;
import java.time.Period;

public class PeriodFormat {
	
	static void calculatePeriod(LocalDate startDate, LocalDate endDate)
	{
		Period period = Period.between(startDate, endDate);
		System.out.println("The period between start date and end date is :" + period);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate startDate = LocalDate.parse("2022-10-12");
		LocalDate endDate = LocalDate.parse("2023-11-21");
		calculatePeriod(startDate, endDate);

	}

}
