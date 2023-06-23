import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Day29SplitTheListIntoChunks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> DemoList = IntStream.rangeClosed(100, 120).boxed().collect(Collectors.toList());
		int ChunckSize=5;
		
		List<List<Integer>> Chunks = new ArrayList<>();
		for (int x = 0; x < DemoList.size(); x += ChunckSize) {
            Chunks.add(DemoList.subList(x, Math.min(x + ChunckSize, DemoList.size())));
        }

        System.out.println(Chunks);
       
        System.out.println(Chunks.get(1).get(1));
        
        
        for(int i=0;i<Chunks.size();i++)
        {
        	System.out.println("Chunk:"+i);
        	for(int j=0;j<Chunks.get(i).size();j++)
        	{
        		int first=Chunks.get(i).get(0);
        		int lastnum =Chunks.get(i).size()-1;
        		int last=Chunks.get(i).get(lastnum);
        		System.out.println("First number of "+first);
        		System.out.println("The last number of"+last);
        	}
        }
        
	}

}
