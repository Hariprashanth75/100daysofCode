package Day69DateTime;
import java.time.LocalDate;
public class DateTimeExample {
	
	public static void p(Object o)
	{
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now = LocalDate.now();
		p(now);
		
		LocalDate hiredate = LocalDate.of(2022, 10, 27);
		p(hiredate);
		
		LocalDate weekfromnow = now.plusWeeks(2);
		p(weekfromnow);
		
		LocalDate weekminus = now.minusWeeks(2);
		p(weekminus);
		
		System.out.println(hiredate.isBefore(now));


	}

}
