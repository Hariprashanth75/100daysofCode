package Day78Dequeue;

import java.util.ArrayDeque;

public class DequeuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque q = new ArrayDeque();
		
		q.add("Harry");
		q.add("Garry");
		q.add("Sally");
		q.add("Edward");
		q.add("Bill");
		
		System.out.println(q);
		
		q.removeFirst();
		System.out.println(q);
		
		q.removeLast();
		System.out.println(q);
		
		q.addFirst("Clinton");
		System.out.println(q);
		
		q.addLast("Lopez");
		System.out.println(q);
		
		

	}

}
