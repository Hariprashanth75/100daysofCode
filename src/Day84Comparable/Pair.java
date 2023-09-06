package Day84Comparable;

public class Pair implements Comparable<Pair> {

	String x;
	int y;
	
	Pair(String x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public String toString()
	{
		return "(" + x + "," +y+ ")";
	}
	@Override
	public int compareTo(Pair a) {
		// TODO Auto-generated method stub
		
		if(this.x.compareTo(a.x) != 0)
		{
			return this.x.compareTo(a.x);
		}
		else
		{
			return this.y = a.y;
		}
	}

	

}
