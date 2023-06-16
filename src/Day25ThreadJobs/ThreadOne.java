package Day25ThreadJobs;

public class ThreadOne extends Thread{

	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("The second process is executing job"+j);
		}
	}
}
