import java.util.Arrays;

public class Day72ArraysOpsRevisited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] letters = {'e','c','d','a','b'};
		System.out.println(letters);
		Arrays.sort(letters);
		System.out.println(letters);
		
		int clocation = Arrays.binarySearch(letters, 'c');
		System.out.println(clocation);
		
		Arrays.fill(letters, 's');
		System.out.println(letters);

	}

}
