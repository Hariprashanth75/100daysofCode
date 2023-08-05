
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}


public class Day49JavaLinkedListCountNodes {

    Node head;
	
	public void push(int new_data)
	{
		Node new_item = new Node(new_data);
		new_item.next = head;
		head=new_item;
	}
	
	public int getCount(Node node, int count)
	{
		if(node == null)
			return count;
		return getCount(node.next,1+count);
	}
	
	public int Count() {return getCount(head,0);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day49JavaLinkedListCountNodes ll = new Day49JavaLinkedListCountNodes();
		ll.push(2);
		ll.push(4);
		ll.push(6);
		ll.push(8);
		ll.push(10);
		
		System.out.println("The number of nodes in linked list are="+ll.Count());
		

	}

}
