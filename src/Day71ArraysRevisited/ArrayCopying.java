package Day71ArraysRevisited;

public class ArrayCopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lame program to try array copy
		int[] array = {1,2,3};
		int[] temp = array;
		
		array = new int[4];
		System.arraycopy(array, 0, temp, 0, temp.length);
		temp = null;
		
		for(int element : array)
			System.out.println(element + " ");

	}

}
