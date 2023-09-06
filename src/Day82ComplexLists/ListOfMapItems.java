package Day82ComplexLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfMapItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, List<String>> bookAuth = new HashMap<>();
		bookAuth.put("Java", Arrays.asList("Author 1", "Author 2"));
		bookAuth.put(".NET", Arrays.asList("Author X", "Author y"));
		bookAuth.put("Scala", Arrays.asList("Author A", "Author B"));
		
		System.out.println(bookAuth);
		
		List<HashMap<String, List<String>>> booksAuthorsMapsList = new ArrayList<>();
		
		booksAuthorsMapsList.add(bookAuth);
		
		System.out.println(booksAuthorsMapsList);
		
		
		
		//But do not try create complex lists

	}

}
