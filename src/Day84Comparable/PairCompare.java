package Day84Comparable;

import java.util.Arrays;

public class PairCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
        Pair arr[] = new Pair[n];
 
        arr[0] = new Pair("Articulate", 3);
        arr[1] = new Pair("a123", 4);
        arr[2] = new Pair("bBaller", 5);
        arr[3] = new Pair("a", 2);
 
        // Sorting the array
        Arrays.sort(arr);
 
        // printing the
        // Pair array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

	}

}
