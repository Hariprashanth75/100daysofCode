package Day71ArraysRevisited;

public class ArrayCopyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] source = {1,3,5,7,9,11,13};
		int[] destination = {2,4,6,8,10,11,12};
		
		int source_arr[], source_pos, destination_arr[], destination_pos, length;
		
		source_arr = source;
		source_pos = 2;
		destination_arr = destination;
		destination_pos = 3;
		length = 3;
		
		System.out.println("Source array:");
		for(int i = 0; i< source.length ; i++)
		{
			System.out.println(source[i] + " ");
		}
		System.out.println("Source pos:"+source_pos);
		System.out.println(" ");
		
		System.out.println("Destination array:");
		for(int i = 0; i< destination.length ; i++)
		{
			System.out.println(destination[i] + " ");
		}
		System.out.println("Destination pos:"+destination_pos);
		
		System.arraycopy(source_arr, source_pos, destination_arr, destination_pos, length);
		
		System.out.println("Final destination array: ");
		for(int i=0; i<destination.length;i++)
		{
			System.out.println(destination[i] + " ");
		}

	}

}
