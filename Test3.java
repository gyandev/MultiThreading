package com.gyan.Threads;
class ThreadB extends Thread
{
	int total=0;
	@Override
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<=100;i++)
			{
				total=total +i;
			}
			notify();
		//	notifyAll();
			
		}
	}
}
public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b=new ThreadB();
		b.start();	
		synchronized(b)
		{
			b.wait();
		}
		System.out.println(b.total);
	}

}
