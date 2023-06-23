package JavaJDBC;
import java.util.concurrent.*;
public class TaskRunnable implements Runnable{
	int execute;
	int start;
	int end;
	
	public TaskRunnable(int execute, int start, int end)
	{
		this.execute=execute;
		this.start=start;
		this.end=end;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
		System.out.println("Executing Thread:  "+execute+"  load from:  "+start+"  to:  "+end);
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
