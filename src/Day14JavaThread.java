
public class Day14JavaThread extends Thread{
public static int amount =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Day14JavaThread thread = new Day14JavaThread();
    thread.start();
    while(thread.isAlive())
    {
    	System.out.println("Waiting for execution");
    }
    System.out.println("amount:"+amount);
    amount++;
    System.out.println("amount:"+amount);
    amount++;
    System.out.println("amount:"+amount);
	}
public void run()
{
	
	amount++;
}
}

