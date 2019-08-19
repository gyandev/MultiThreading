package com.gyan.Threads;
class Z2 extends Thread
{
	@Override
	public void run()
	{
		try
		{
			sleep(1000);
		}
		catch(InterruptedException e)
		{
		//	e.printStackTrace();
			System.out.println("exception");
		}
		System.out.println(isInterrupted());
	}
}
public class Z5 {
	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();
	//	ThreadUtil.sleep(1000);
	//	t1.isInterrupted();
		System.out.println("done");
		
	}

}
