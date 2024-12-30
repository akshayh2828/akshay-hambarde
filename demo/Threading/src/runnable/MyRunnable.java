package runnable;

public class MyRunnable implements Runnable
{

	@Override
	public void run() {
	
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyRunnable th=new MyRunnable();
		Thread t=new Thread(th);
		t.start();
		
	}
}
