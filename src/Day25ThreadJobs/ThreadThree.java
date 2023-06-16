package Day25ThreadJobs;

public class ThreadThree extends Thread{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("The process 3 is executing job"+k);
		}
	}

}
