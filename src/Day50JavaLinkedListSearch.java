import java.util.*;

class NodeOne
{
	int key;
	NodeOne next;
	
	NodeOne(int key)
	{
		this.key=key;
		this.next=null;
				
	}
}
public class Day50JavaLinkedListSearch {
	
	static void push(NodeOne[] head_ref, int new_key)
	{
		NodeOne new_node = new NodeOne(new_key);
		new_node.next = head_ref[0];
		head_ref[0]=new_node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeOne[] head = new NodeOne[1];
		int x=21;
		
		push(head,10);
		push(head,21);
		push(head,60);
		push(head,70);
		
		Vector<Integer> v = new Vector<Integer>();
		NodeOne temp=head[0];
		while(temp!= null) {
			v.add(temp.key);
		    temp =temp.next;
		}
		    
		    
		int it=v.indexOf(x);
		if(it==-1)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
			
			

	}

}
