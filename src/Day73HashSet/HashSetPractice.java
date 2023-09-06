package Day73HashSet;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The goal here is no duplicate elements gets added
		HashSet hash = new HashSet();
		hash.add("Boston");
		hash.add("New York");
		hash.add("Oregon");
		hash.add("New York");
		hash.add("Dallas");
		
		System.out.println(hash);
		
		

	}

}
