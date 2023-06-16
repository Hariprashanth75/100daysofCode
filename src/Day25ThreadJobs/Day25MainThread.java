package Day25ThreadJobs;


public class Day25MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java thread process");
		ThreadOne process2 = new ThreadOne();
		ThreadThree process3 = new ThreadThree();
		
		//Process 2
		process2.run();
		
		
		//Process 1
		for(int i=1;i<=5;i++)
		{
			System.out.println("The process 1 is running the job"+i);
		}
		
		//Process 3
		process3.run();
		
		System.out.println("Java thread completed");
	}

}
