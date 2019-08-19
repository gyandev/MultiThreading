package com.gyan.Threads;
class M11 extends Thread
{
	@Override
	public void run()
	{
		try
		{
			sleep(15000);
		}
		catch(InterruptedException e)
		{
			System.out.println("exception");
		}
		System.out.println(isInterrupted());
	}
}
public class A25 {
	public static void main(String[] args) {
		M11 m=new M11();
		m.start();
		ThreadUtil.sleep(10000);
		m.interrupt();
		System.out.println("done");
	}

}
