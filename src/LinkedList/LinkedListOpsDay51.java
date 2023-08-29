package LinkedList;

public class LinkedListOpsDay51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList(4);
		l.insert(5);
		l.insert(6);
		l.insert(7);
		l.insert(8);
		//l.printHead();
		//l.printTail();
		
//		System.out.println("Remove last"+l.removeLast().value);
//		System.out.println("Remove last"+l.removeLast().value);
//		System.out.println("Remove last"+l.removeLast());
		
		//l.prepend(3);
		
//		// (2) Items - Returns 2 Node
//        System.out.println(l.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(l.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(l.removeFirst());
	   
		
	//	System.out.println(l.get(1).value);
	//	l.set(2, 10);
	//	l.remove(2);
		l.reverse();
		l.printList();
		
		
		
	}

}
