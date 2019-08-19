package com.gyan.Threads;
class Z1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			if(!isInterrupted())
			{
				System.out.println("something");
			}
			else
			{
				System.out.println("do something");
			}
		}
	}
}
public class A24 {
	public static void main(String[] args) throws InterruptedException {

	Z1 z=new Z1();
	z.start();
	Thread.currentThread().sleep(5);
//	ThreadUtil.sleep(5);
	z.interrupt();
	System.out.println("done");
	}

}
