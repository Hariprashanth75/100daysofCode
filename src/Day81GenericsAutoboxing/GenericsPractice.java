package Day81GenericsAutoboxing;

import java.util.ArrayList;
import java.util.List;

public class GenericsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(Integer.valueOf(10));
		l.add(Integer.valueOf(20));
		l.add(Integer.valueOf(30));
		
		//Check this one
		int val = l.get(1).intValue();
		
		System.out.println(val);
		//Autoboxing
		Integer y =5;
		System.out.println(y);
		
		l.add(40);
		//Java does autoboxing and wrapping so we dont have to cast the value seperately to get it out
		int x = l.get(3);
		System.out.println(x);

	}

}
