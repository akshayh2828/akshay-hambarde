package excutorservice;

public class Task1 extends Thread
{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("task1="+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
