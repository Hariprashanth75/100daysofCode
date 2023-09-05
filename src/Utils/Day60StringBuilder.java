package Utils;
import java.util.*;

public class Day60StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		String name ="Harry";
		sb.append("Hello ");
		sb.append(name);
		sb.append(". Today is ");
		Object Calender;
		sb.append(Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US));
		sb.append(".");
		
		System.out.println(sb);

	}

}
