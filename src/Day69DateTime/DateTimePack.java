package Day69DateTime;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimePack {
	
	public static void p(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime now = LocalDateTime.now();
		p(now);
		LocalDateTime of = LocalDateTime.of(2008, Month.APRIL, 21, 13 , 0, 0);
		p(of);
		
		Period period = Period.of(3, 5, 12);
		now = now.minus(period);
		p(now);
		
		now = now.plus(period);
		p(now);
		
		

	}

}
