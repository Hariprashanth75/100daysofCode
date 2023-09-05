package Day69DateTime;

import java.time.LocalTime;

public class TimeExample {

	public static void p(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime now = LocalTime.now();
		p(now);
		
		LocalTime of = LocalTime.of(13, 00);
		p(of);
		
		LocalTime hourfromnow = now.plusHours(1);
		p(hourfromnow); 
		
		

	}

}
