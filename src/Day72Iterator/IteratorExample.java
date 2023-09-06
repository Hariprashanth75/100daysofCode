package Day72Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(4);
		arr.add(7);
		arr.add(9);

		Iterator itr = arr.iterator();

		while (itr.hasNext()) {
			int i = (int) itr.next();
			System.out.println(" " + i);
			if (i % 2 != 0) {
				itr.remove();
			}
		}
		System.out.println(" ");
		System.out.println(arr);

	}

}
