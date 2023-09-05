package Day68LambdaExpressions;
import java.util.ArrayList;
public class ArrayListLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		arr.forEach(n -> System.out.println(n));
		
		arr.forEach(n -> { if(n%2 ==0) System.out.println(n); });
		

	}

}
