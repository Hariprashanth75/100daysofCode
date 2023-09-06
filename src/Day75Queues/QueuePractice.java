package Day75Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();
		queue.add("Delhi");
		queue.add("Mumbai");
		queue.add("Chennai");
		queue.add("Goa");
		System.out.println(queue);
		
		queue.remove("Mumbai");
		
		System.out.println(queue);
		
		
		boolean contain = queue.contains("Chennai");
		System.out.println(contain);
		
		String peek = queue.peek();
		System.out.println(peek);
		
		queue.remove();
		System.out.println(queue);
		
		

	}

}
