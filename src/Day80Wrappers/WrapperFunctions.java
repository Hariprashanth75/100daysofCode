package Day80Wrappers;

import java.util.ArrayList;
import java.util.List;

public class WrapperFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l = new ArrayList();
		
		int val = 7;
		l.add(Integer.valueOf(val));
		System.out.println(l);
		
		Integer wrapint = Integer.valueOf(7);
		System.out.println(wrapint);
		
		int j = Integer.valueOf(7);
		System.out.println(7);
		
		Character wrapChar = Character.valueOf('A');
		System.out.println(wrapChar);
		char c = Character.valueOf('A');
		System.out.println(c);
		
		

	}

}
