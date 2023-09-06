package Day83AnonymousArrays;

import java.util.Arrays;
import java.util.List;

import Day65Polymorphism.MyDate;



public class ListOfDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyDate is separate class in Day65 package
		List<MyDate> datesArray = Arrays.asList(new MyDate(2,1,2022), new MyDate(3,2,2022));
		System.out.println(datesArray);
		
		MyDate[] datesArray2 = {new MyDate(2,1,2022), new MyDate(3,2,2022)};
		List<MyDate> dates = Arrays.asList(datesArray2);
		System.out.println(dates);
		
		

	}

}
