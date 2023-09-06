package Day76PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> p = new PriorityQueue<String>();
		
		p.add("Shanghai");
		p.add("Beijing");
		p.add("Taiwan");
		
		System.out.println(p);
		
		System.out.println(p.peek());
		p.poll();
		System.out.println(p);
		
		PriorityQueue<Integer> i = new PriorityQueue<Integer>();
		i.add(10);
		i.add(1);
		i.add(25);
		
		System.out.println(i);
		
		System.out.println(i.peek());
		i.poll();
		System.out.println(i);
		
		Iterator iterator = i.iterator();
		 
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
        System.out.println(" ");
        System.out.println(i.size());
		
		
		

	}

}
