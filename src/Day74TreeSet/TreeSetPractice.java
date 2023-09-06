package Day74TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// All the elements get sorted by default in tree set
		TreeSet tree = new TreeSet();
		tree.add(12);
		tree.add(190);
		tree.add(4000);
		tree.add(4);
		
		System.out.println(tree);
		
		Set orderedset = new TreeSet();
		
		orderedset.add("A");
		orderedset.add("3");
		orderedset.add("b");
		System.out.println(orderedset);
		
		

	}

}
