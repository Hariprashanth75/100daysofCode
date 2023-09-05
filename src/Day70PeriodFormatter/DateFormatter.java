package Day70PeriodFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatter {
	public static void p(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtf3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/dd/MM");
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("'In the year of 'yyyy 'and the ' dd 'th day of month 'MM");
		
		p(now.format(dtf));
		p(now.format(dtf1));
		p(now.format(dtf2));
		p(now.format(dtf3));
		p(now.format(dtf4));
		p(now.format(dtf5));
		

	}

}
