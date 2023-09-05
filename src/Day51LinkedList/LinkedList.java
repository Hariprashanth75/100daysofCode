package Day51LinkedList;

public class LinkedList {
	
	private int length;
	private Node head;
	private Node tail;
	
	class Node
	{
		int value;
		Node next;
		
		Node(int value)
		{
			this.value=value;
		}
	}
	
	public LinkedList(int value)
	{
		
		Node newNode = new Node(value);
		head= newNode;
		tail= newNode;
		length = 1;
		
	}
	
	public void printList()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println("Node value:"+temp.value);
		    temp=temp.next;
		}
	}
	
	public void printHead()
	{
		System.out.println("Head value:"+head.value);
	}
	
	public void printTail()
	{
		System.out.println("Tail value:"+tail.value);
	}
	
	public void length()
	{
		System.out.println("Length:"+length);
	}
	
	public void insert(int data)
	{
		Node newNode = new Node(data);
		if(length==0)
		{
			newNode.value=data;
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next=newNode;
			tail = newNode;
		}
		length++;
	}
	
	public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
	
	public void prepend(int value)
	{
		Node newNode = new Node(value);
		if(length==0)
		{
			newNode = head;
			newNode = tail;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
		length++;
	}
	
	public Node removeFirst() {
		if(length==0) return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if(length==0)
		{
			tail=null;
			
		}
		return temp;
	}
	
	public Node get(int index)
	{
		
		if(length==0 || index >=length) return null;
		Node temp = head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	
	public boolean set(int index, int value)
	{
		Node temp = get(index);
		if(temp!=null)
		{
			temp.value=value;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean insertPos(int index, int value)
	{
		if(index<0 || index>length) return false;
		
		if(index == length)
		{
			insert(value);
			return true;
		}
		if(index == 0)
		{
			prepend(value);
			return true;
		}
		
		Node newNode = new Node(value);
		Node temp = new Node(index-1);
		newNode.next = temp.next;
		temp.next=newNode;
		length++;
		return true;
		
	}
	
	public Node remove(int index)
	{
		if(length==0) return removeFirst();
		
		if(index == length-1) return removeLast();
		
		Node prev = get(index-1);
		Node temp = prev.next;
		prev.next =temp.next;
		temp.next = null;
		length--;
		return temp;
		
	}
	
	public void reverse()
	{
		Node temp = head;
		head = tail;
		tail=temp;
		
		Node after = temp.next;
		Node before = null;
		
		for(int i=0;i<length;i++)
		{
			after = temp.next;
			temp.next=before;
			before=temp;
			temp = after;
		}
	}

}
