package Testing;
import Domain.Day52MyDate;

public class Day52TestMyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day52MyDate date1 = new Day52MyDate(11,11,1918);
		Day52MyDate date2 = new Day52MyDate();
		date2.day = 11;
		date2.month = 11;
		date2.year = 1918;
		Day52MyDate date3 = new Day52MyDate();
		date3.setDate(4,21,1968);
		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		Day52MyDate date4 = new Day52MyDate();
		String str4 = date4.toString();
		System.out.println(str4);

	}

}
