package excutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread 
{
	public static void main(String[] args) {
		ExecutorService ex=Executors.newSingleThreadExecutor();
		ex.execute(new Thread(new Task2()));
		ex.execute(new Task1());
	}

}
