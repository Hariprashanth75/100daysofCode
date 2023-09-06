package Day79HashMapRevisit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapRevisit {
	
	public static void main(String[] args)
	{
		
		HashMap<String, Integer> map1 =  new HashMap<>();
		
		map1.put("Harry", 1);
		map1.put("Sally", 2);
		map1.put("Wilson", 3);
		
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		map2.put("Bob", 10);
		map2.put("Sunny", 12);
		map2.put("Bill", 14);
		
		System.out.println(map1);
		System.out.println(map2);
		
		if(map1.containsKey(1))
		{
			System.out.println("Yes key 1 is found");
		}
		
		if(map2.containsValue("Sunny"))
		{
			System.out.println("Yes we found the value sunny");
		}
		
		
		Set s = map1.keySet();
		System.out.println(s);
		
		Collection c = map1.values();
		System.out.println(c);
		
		
	}

}
