package Day100BinaryTree;

import java.util.Scanner;

public class BinaryTreeInsertion {
	
	public static class Node
	{
		Node left;
		Node right;
		int value;
		Node(int value)
		{
			this.value = value;
		}
	}
	
	public void run()
	{
		
		
		System.out.println("Enter the root value");
		Scanner sc = new Scanner(System.in);
		int rootValue = sc.nextInt();
		Node root = new Node(rootValue);
		System.out.println("Tree with root value" + root.value);
		System.out.println("Enter the number of elements you wish to enter: ");
		int num = sc.nextInt();
		int value;
		for(int i=0; i<num ; i++)
		{
			value = sc.nextInt();
			insert(root,value);
		}
		
		
	}
	
	public void insert(Node node, int value)
	{
		if(value < node.value)
		{
			if(node.left!= null)
			{
				insert(node.left, value);
			}
			else
			{
				System.out.println("Inserted "+value+ " To the left node");
				node.left =  new Node(value);
			}		
		}
		
		else if(value > node.value)
		{
			if(node.right!=null)
			{
				insert(node.right, value);
			}
			else
			{
				System.out.println("Inserted "+value+ "To the right node");
				node.right = new Node(value);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binary Tree");
		new BinaryTreeInsertion().run();

	}

}
